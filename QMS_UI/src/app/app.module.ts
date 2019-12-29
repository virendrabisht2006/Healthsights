import {CommonModule, HashLocationStrategy, LocationStrategy} from '@angular/common';
import {HTTP_INTERCEPTORS, HttpClient, HttpClientModule} from '@angular/common/http';
import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {TranslateLoader, TranslateModule} from '@ngx-translate/core';
import {TranslateHttpLoader} from '@ngx-translate/http-loader';
import {GrowlModule} from 'primeng/growl';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent, SafePipe} from './app.component';
import {AuthGuard} from './shared';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpErrorHandler} from './shared/services/http-error-handler.service';
import {MessageService} from './shared/services/message.service';
import {JwtInterceptor} from './shared/helpers/jwt.interceptor';
import {AuthenticationService} from './shared/services/authenticationservice';
import {GapsService} from './shared/services/gaps.service';
import {AnnyangService} from './shared/services/annyang.service';


import {ConfirmationService} from 'primeng/api';
import {RoleGuardService} from './shared/services/RouteGuard.service';
import {AbstractionService} from './shared/services/abstraction.service';

// AoT requires an exported function for factories
export const createTranslateLoader = (http: HttpClient) => {
    return new TranslateHttpLoader(http, './assets/i18n/', '.json');
};

@NgModule({
    imports: [
        CommonModule,
        BrowserModule,
        BrowserAnimationsModule,
        FormsModule,
        GrowlModule,
        ReactiveFormsModule,
        HttpClientModule,
        TranslateModule.forRoot({
            loader: {
                provide: TranslateLoader,
                useFactory: createTranslateLoader,
                deps: [HttpClient]
            }
        }),
        AppRoutingModule
    ],
    declarations: [AppComponent, SafePipe],
    exports: [
        CommonModule,
        FormsModule,
        ReactiveFormsModule
    ],
    providers: [AuthGuard,
        HttpErrorHandler,
        MessageService,
        AuthenticationService,
        GapsService,
        AnnyangService,
        ConfirmationService,
        RoleGuardService,
        AbstractionService,
        {provide: LocationStrategy, useClass: HashLocationStrategy},
        {provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true}],

    bootstrap: [AppComponent]
})
export class AppModule {
}
