import { RouterModule, Routes } from '@angular/router';

import { UsersComponent } from './components/users/users.component';
//import { SearchComponent } from './componentes/search/search.component';
//import { AddRecipeComponent } from './componentes/add-recipe/add-recipe.component';
//import { ViewRecipeComponent } from './componentes/view-recipe/view-recipe.component';

const APP_MODULES: Routes = [
    { path: 'home', component: UsersComponent },
    //    { path: 'search', component: SearchComponent },
    //    { path: 'add', component: AddRecipeComponent },
    //    { path: 'view/:id', component: ViewRecipeComponent },
    { path: '**', pathMatch: 'full', redirectTo: 'home' }
];

export const APP_ROUTING = RouterModule.forRoot(APP_MODULES, { useHash: true });
