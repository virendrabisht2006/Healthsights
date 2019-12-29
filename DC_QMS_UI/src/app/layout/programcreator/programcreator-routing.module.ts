import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ProgramcreatorComponent} from './programcreator.component';


const routes: Routes = [
    {
        path: '', component: ProgramcreatorComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class DashboardRoutingModule {
}

export class ProgramcreatorRoutingModule {
}
