package com.example.tfg.Sistems.SistemaPlatos.adaptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tfg.R;
import com.example.tfg.Sistems.SistemaPlatos.models.Category;

import java.util.List;

public class AdptLCatIntroducirFH extends BaseAdapter {
    private Context context;
    private List<Category> list;
    private int layout;

    public AdptLCatIntroducirFH(Context context, List<Category> list, int layout) {
        this.context = context;
        this.list = list;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout, null);
            vh = new ViewHolder();

            vh.textViewNombre = (TextView) convertView.findViewById(R.id.listViewItemFranjaHorarioIntroducirPlatoCategoriaTextView);
            vh.imageViewCategoria = (ImageView) convertView.findViewById(R.id.listViewItemFranjaHorarioIntroducirPlatoCategoriaImageView);
            convertView.setTag(vh);
        }
        else
            vh = (ViewHolder) convertView.getTag();

        Category categoria = list.get(position);

        vh.textViewNombre.setText(categoria.getNombreCategoria().toUpperCase());
        vh.imageViewCategoria.setImageResource(categoria.getImage());

        //AdaptadorListPlatosIntroducirFranjaHorario adaptadorIngredientes = new AdaptadorListPlatosIntroducirFranjaHorario(context, listPlatoFinal, R.layout.list_view_item_franja_introducir_plato);
        //listView.setAdapter(adaptadorCategoria);

        return convertView;
    }

    public class ViewHolder{
        TextView textViewNombre;
        ImageView imageViewCategoria;
    }
}
