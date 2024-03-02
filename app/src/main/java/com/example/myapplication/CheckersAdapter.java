package com.example.myapplication;
    import android.content.Context;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.BaseAdapter;
    import android.widget.ImageView;
    import android.widget.GridView;

    public class CheckersAdapter extends BaseAdapter {

        private Context context;

        public CheckersAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return 64;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if (convertView == null) {
                imageView = new ImageView(context);
                int size = getSquareSize(parent);

                GridView.LayoutParams params = new GridView.LayoutParams(size, size);
                imageView.setLayoutParams(params);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(2, 2, 2, 2);
            } else {
                imageView = (ImageView) convertView;
            }
            if ((position / 8 + position % 8) % 2 == 0) {
                imageView.setImageResource(R.drawable.light_square);
            } else {
                imageView.setImageResource(R.drawable.dark_square);
            }

            return imageView;
        }
        private int getSquareSize(ViewGroup parent) {
            int parentWidth = parent.getWidth();
            if (parentWidth == 0) {
                parentWidth = parent.getResources().getDisplayMetrics().widthPixels;
            }
            int squareSize = parentWidth / 8;
            return squareSize;
        }
    }

