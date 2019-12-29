import {Component, OnInit} from '@angular/core';
import {routerTransition} from '../../router.animations';
import {SafePipe} from '../../app.component';
import {ActivatedRoute} from '@angular/router';

@Component({
    selector: 'app-tables',
    templateUrl: './cluster-analysis.component.html',
    animations: [routerTransition()],
    providers: [SafePipe]
})
export class ClusterAnalysisComponent implements OnInit {
    public externalURL: any;

    constructor(private route: ActivatedRoute, private safe: SafePipe) {
        // console.log(this.route);

        this.externalURL = this.safe.transform('http://192.168.184.70/t/CurisSite/views/Clustering/Clustering?:embed=y&:showAppBanner=false&:showShareOptions=true&:display_count=no&:showVizHome=no');

    }

    ngOnInit() {

    }
}
