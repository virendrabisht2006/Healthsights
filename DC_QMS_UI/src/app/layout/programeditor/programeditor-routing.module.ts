import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ProgrameditorComponent} from './programeditor.component';


const routes: Routes = [
    {
        path: '', component: ProgrameditorComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class DashboardRoutingModule {
}

export class ProgrameditorRoutingModule {
}
