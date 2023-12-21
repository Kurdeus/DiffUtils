package eu.kurdeus.diffutils
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import eu.kurdeus.diffutils.databinding.ItemsBinding

class DiffAdapter: RecyclerView.Adapter<DiffAdapter.ViewHolder>() {
    lateinit var binding: ItemsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiffAdapter.ViewHolder {
        binding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: DiffAdapter.ViewHolder, position: Int) {
        holder.setData(differ.currentList[position])
    }

    override fun getItemCount() = differ.currentList.size


    inner class ViewHolder:RecyclerView.ViewHolder(binding.root){
        fun setData(item: DataClass) {
            binding.button.text = item.title



        }


    }
    private val diffCallback = object : DiffUtil.ItemCallback<DataClass>(){
        override fun areItemsTheSame(oldItem: DataClass, newItem: DataClass): Boolean {
            return  oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: DataClass, newItem: DataClass): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, diffCallback)
}