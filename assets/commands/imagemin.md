# TLDR

**Compress images in place**

```imagemin [images/*] --out-dir=[images]```

**Compress to different directory**

```imagemin [src/images/*] --out-dir=[dist/images]```

**Use specific plugin**

```imagemin [images/*] --plugin=pngquant --out-dir=[output]```

**Set quality**

```imagemin [images/*] --plugin.mozjpeg.quality=80 --out-dir=[output]```

# SYNOPSIS

**imagemin** [_options_] _files_

# PARAMETERS

**--out-dir**, **-o** _dir_
> Output directory.

**--plugin** _name_
> Use specific plugin.

**--plugin.**_name_._option_
> Plugin option.

# DESCRIPTION

**imagemin** is an image optimization tool. It compresses PNG, JPEG, GIF, and SVG images using various plugins while maintaining visual quality.

It's commonly used in build pipelines to reduce image file sizes for web applications, improving load times without noticeable quality loss.

# PLUGINS

```
imagemin-mozjpeg     JPEG optimization
imagemin-pngquant    PNG optimization
imagemin-gifsicle    GIF optimization
imagemin-svgo        SVG optimization
imagemin-webp        WebP conversion
```

# NODE.JS USAGE

```javascript
const imagemin = require('imagemin');
const mozjpeg = require('imagemin-mozjpeg');

await imagemin(['images/*.jpg'], {
  destination: 'dist/images',
  plugins: [mozjpeg({quality: 75})]
});
```

# CAVEATS

Requires Node.js. Plugins installed separately. Lossy compression reduces quality. Original files overwritten with same out-dir.

# HISTORY

imagemin was created as a Node.js-based image optimization toolkit. It provides a unified interface for various image compression algorithms, popular in web development workflows.

# SEE ALSO

[optipng](/man/optipng)(1), [jpegoptim](/man/jpegoptim)(1), [svgo](/man/svgo)(1)
