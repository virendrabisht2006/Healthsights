import {Injectable} from '@angular/core'

declare let annyang: any

@Injectable()
export class AnnyangService {
    commands = {};

    start() {

        annyang.start({continuous: false});
    }

    debug() {
        annyang.debug(true);
    }

    addcommands(commands) {
        annyang.addCommands(commands);
    }

}
