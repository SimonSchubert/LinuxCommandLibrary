# TAGLINE

image optimization tool

# TLDR

**Optimize images** into an output directory

```imagemin [images/*] --out-dir=[build]```

**Optimize a single file** to stdout

```imagemin [image.png] > [image-optimized.png]```

**Read from stdin**

```cat [image.png] | imagemin > [image-optimized.png]```

**Use a specific plugin** instead of the defaults

```imagemin [image.png] --plugin=pngquant > [image-optimized.png]```

**Pass plugin options**

```imagemin [photo.jpg] --plugin.mozjpeg.quality=75 > [photo-optimized.jpg]```

**Convert to WebP** with a preset

```imagemin [image.png] --plugin.webp.quality=95 --plugin.webp.preset=icon > [image.webp]```

# SYNOPSIS

**imagemin** _path|glob_ ... **--out-dir**=_dir_ [**--plugin**=_name_ ...]

**imagemin** _file_ > _output_

# PARAMETERS

**-o**, **--out-dir** _dir_
> Output directory. Without it, a single input is written to stdout.

**-p**, **--plugin** _name_
> Use the named plugin (the **imagemin-** prefix is omitted). Can be repeated. Overrides the default plugins.

**--plugin.**_name_._option_=_value_
> Pass an option to a plugin. Repeat the flag to build an array value.

# DESCRIPTION

**imagemin** is the command-line interface of the imagemin Node.js library. It minifies PNG, JPEG, GIF and SVG images using plugins and can convert to formats such as WebP.

By default it uses **gifsicle**, **jpegtran**, **optipng** and **svgo** (lossless). Other plugins such as **mozjpeg**, **pngquant** or **webp** must be installed separately as **imagemin-**_name_ packages.

# PLUGINS

```
imagemin-jpegtran    Lossless JPEG optimization (default)
imagemin-optipng     Lossless PNG optimization (default)
imagemin-gifsicle    GIF optimization (default)
imagemin-svgo        SVG optimization (default)
imagemin-mozjpeg     Lossy JPEG compression
imagemin-pngquant    Lossy PNG compression
imagemin-webp        WebP conversion
```

# NODE.JS USAGE

```javascript
import imagemin from 'imagemin';
import imageminMozjpeg from 'imagemin-mozjpeg';

await imagemin(['images/*.jpg'], {
  destination: 'dist/images',
  plugins: [imageminMozjpeg({quality: 75})]
});
```

# CAVEATS

Requires Node.js; install with **npm install --global imagemin-cli**. Current versions are ESM-only. Many plugins wrap native binaries that are downloaded or compiled at install time, which frequently fails on newer Node.js versions or unusual platforms. Lossy plugins reduce quality. Pointing **--out-dir** at the source directory overwrites the originals. Development has slowed considerably; plugins are rarely updated.

# HISTORY

imagemin was created by **Kevin Martensson** and is maintained under the imagemin GitHub organization with **Sindre Sorhus**. It became a standard image optimization step in Grunt, Gulp and webpack build pipelines.

# SEE ALSO

[optipng](/man/optipng)(1), [jpegoptim](/man/jpegoptim)(1), [pngquant](/man/pngquant)(1), [gifsicle](/man/gifsicle)(1), [svgo](/man/svgo)(1), [cwebp](/man/cwebp)(1)

# RESOURCES

```[Source code](https://github.com/imagemin/imagemin-cli)```

```[Documentation](https://github.com/imagemin/imagemin)```

<!-- verified: 2026-09-29 -->
