package com.jess.schollinvent.common.component

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.jess.schollinvent.R
import com.jess.schollinvent.databinding.CommonHeaderBinding

/**
 * 공통 헤더뷰
 *
 * @author jess
 */
class HeaderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private var binding = CommonHeaderBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        intLayout(attrs, defStyleAttr)
    }

    @SuppressLint("CustomViewStyleable", "Recycle", "CheckResult")
    private fun intLayout(
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) {
        attrs?.let {
            val typedValue = context.obtainStyledAttributes(
                attrs,
                R.styleable.HeaderView,
                defStyleAttr,
                0
            )

            // 타이틀
            setTitle(typedValue.getString(R.styleable.HeaderView_title))
        }
    }

    /**
     * 타이틀
     */
    private fun setTitle(title: String?) {
        binding.tvTitle.text = title
    }
}
