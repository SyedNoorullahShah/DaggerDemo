package com.example.android.dagger.dagger.components

import com.example.android.dagger.dagger.scopes.ActivityScope
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface RegistrationComponent {
    fun inject(registrationActivity: RegistrationActivity)
    fun inject(termsAndConditionsFragment: TermsAndConditionsFragment)
    fun inject(enterDetailsFragment: EnterDetailsFragment)

    @Subcomponent.Builder
    interface Builder {
        fun build(): RegistrationComponent
    }
}