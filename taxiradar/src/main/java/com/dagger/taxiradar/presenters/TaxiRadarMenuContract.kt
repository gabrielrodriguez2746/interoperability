package com.dagger.taxiradar.presenters

import com.dagger.core.PresenterView

interface TaxiRadarMenuContract {

    interface View : PresenterView {
        fun saying()
    }

    interface Presenter {
        fun bind(view: View)
    }

}
