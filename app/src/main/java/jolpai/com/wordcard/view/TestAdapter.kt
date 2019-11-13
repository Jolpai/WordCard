package jolpai.com.wordcard.view

import android.support.v7.widget.RecyclerView

class TestAdapter (var wordlist: MutableList<String>): RecyclerView.Adapter<ViewHolder> {
    val TAG ="Test"
    override fun onBindViewHolder(p0: BaseViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
}

class ViewHolder : RecyclerView.ViewHolder {

}