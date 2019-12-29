import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {HandleError, HttpErrorHandler} from '../../../shared/services/http-error-handler.service';
import {CreatePersona} from './create-personas.component';


// const httpOptions = {
//   headers: new HttpHeaders({
//     'Access-Control-Allow-Origin': '*',
//     'Content-Type':  'application/json'
//   })
// };


@Injectable({
    providedIn: 'root'
})
export class PersonaService {

    // headers={
    //     headers: new HttpHeaders({
    //       'Content-Type':  'application/json',
    //       'Authorization': 'my-auth-token'
    //     })
    //    }
    //    headers1={
    //     headers: new HttpHeaders({
    //       'responseType': 'blob',
    //       'Authorization': 'my-auth-token'
    //     })
    //    }
    private handleError: HandleError;

    constructor(private http: HttpClient,
                httpErrorHandler: HttpErrorHandler,
    ) {
        this.handleError = httpErrorHandler.createHandleError('PersonaService');
    }

    commonfileupload(type, model: CreatePersona): Observable<CreatePersona> {
        return this.http.post<CreatePersona>(`http://healthinsight:8082/curis/closeGaps/file_upload/${type}`, model);
    }

    downloadfile(link) {
        return this.http.get(`http://healthinsight:8082/curis/closeGaps/fileDownload?filePath=${link}`, {responseType: 'text'}
        ).pipe(
            catchError(this.handleError('Upload', link)),
        )
    }

    downloadimage(link) {
        return this.http.get(`http://healthinsight:8082/curis/closeGaps/fileDownload?filePath=${link}`, {responseType: 'blob'}
        ).pipe(
            catchError(this.handleError('Upload', link)),
        )
    }

}
