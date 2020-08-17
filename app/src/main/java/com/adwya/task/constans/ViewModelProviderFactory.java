package com.adwya.task.constans;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.adwya.task.MainActivityViewModel;
import com.adwya.task.data.DataManager;
import com.adwya.task.ui.auth.signup.SignUpSignViewModel;
import com.adwya.task.ui.gallery.GalleryViewModel;
import com.adwya.task.ui.map.MapViewModel;
import com.adwya.task.ui.send.SendViewModel;
import com.adwya.task.ui.share.ShareViewModel;
import com.adwya.task.ui.tools.ToolsViewModel;
import com.adwya.task.utils.ResourceProvider;
import com.adwya.task.utils.rx.SchedulerProvider;

import javax.inject.Inject;



public class ViewModelProviderFactory<V> extends ViewModelProvider.NewInstanceFactory {


    private final DataManager dataManager;
    private final SchedulerProvider schedulerProvider;
    private final ResourceProvider resourceProvider;


    @Inject
    public ViewModelProviderFactory(DataManager dataManager, SchedulerProvider schedulerProvider, ResourceProvider resourceProvider) {
        this.dataManager = dataManager;
        this.schedulerProvider = schedulerProvider;
        this.resourceProvider = resourceProvider;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(GalleryViewModel.class)) {
            return (T) new GalleryViewModel(dataManager, schedulerProvider, resourceProvider);
        }else if (modelClass.isAssignableFrom(MainActivityViewModel.class)) {
            return (T) new MainActivityViewModel(dataManager, schedulerProvider, resourceProvider);
        }else if (modelClass.isAssignableFrom(SendViewModel.class)) {
            return (T) new SendViewModel(dataManager, schedulerProvider, resourceProvider);
        }else if (modelClass.isAssignableFrom(ToolsViewModel.class)) {
            return (T) new ToolsViewModel(dataManager, schedulerProvider, resourceProvider);
        }else if (modelClass.isAssignableFrom(ShareViewModel.class)) {
            return (T) new ShareViewModel(dataManager, schedulerProvider, resourceProvider);
        }else if (modelClass.isAssignableFrom(SignUpSignViewModel.class)) {
            return (T) new SignUpSignViewModel(dataManager, schedulerProvider, resourceProvider);
        }else if (modelClass.isAssignableFrom(MapViewModel.class)) {
            return (T) new MapViewModel(dataManager, schedulerProvider, resourceProvider);
        }
        //else if (modelClass.isAssignableFrom(SplashViewModel.class))
//            return (T) new SplashViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(LoginViewModel.class)) {
//            return (T) new LoginViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(ForgitPasswordViewModel.class)) {
//            return (T) new ForgitPasswordViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(MainActivityViewModel.class)) {
//            return (T) new MainActivityViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(HomeFragmentViewModel.class)) {
//            return (T) new HomeFragmentViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(MazedViewModel.class)) {
//            return (T) new MazedViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(AboutFragmentViewModel.class)) {
//            return (T) new AboutFragmentViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(TermsAndConditionsViewModel.class)) {
//            return (T) new TermsAndConditionsViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(RateFragmentViewModel.class)) {
//            return (T) new RateFragmentViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(CallusViewModel.class)) {
//            return (T) new CallusViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(ChatViewModel.class)) {
//            return (T) new ChatViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(OrderViewModel.class)) {
//            return (T) new OrderViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(ProfileViewModel.class)) {
//            return (T) new ProfileViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(UpdateProfileViewModel.class)) {
//            return (T) new UpdateProfileViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(ChangePasswordViewModel.class)) {
//            return (T) new ChangePasswordViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(AddressViewModel.class)) {
//            return (T) new AddressViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(AddAddressViewModel.class)) {
//            return (T) new AddAddressViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(LanguageViewModel.class)) {
//            return (T) new LanguageViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(CategoryViewModel.class)) {
//            return (T) new CategoryViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(ProductsViewModel.class)) {
//            return (T) new ProductsViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(ProductDetailsViewModel.class)) {
//            return (T) new ProductDetailsViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(FullScreanViewModel.class)) {
//            return (T) new FullScreanViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(SearchViewModel.class)) {
//            return (T) new SearchViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(FilterViewModel.class)) {
//            return (T) new FilterViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(CartViewModel.class)) {
//            return (T) new CartViewModel(dataManager, schedulerProvider, resourceProvider);
//        }else if (modelClass.isAssignableFrom(AddressCartViewModel.class)) {
//            return (T) new AddressCartViewModel(dataManager, schedulerProvider, resourceProvider);
//        }


        throw new IllegalArgumentException("Unknown class name: " + modelClass.getName());
    }

}
