package com.dagger.taxiradar

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dagger.taxiradar.presenters.TaxiRadarMenuContract
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class TaxiRadarMenuFragment : Fragment(), TaxiRadarMenuContract.View {

    @Inject
    lateinit var presenter: TaxiRadarMenuContract.Presenter

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        presenter.bind(this)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun saying() {
        Toast.makeText(context, "Something", Toast.LENGTH_SHORT).show()
        TaxiRadarMapState().run {
            print()
        }
    }

}
