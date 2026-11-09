# TAGLINE

Convert HTML pages to images

# TLDR

**Convert an HTML file** to PNG

```wkhtmltoimage [input.html] [output.png]```

**Convert a webpage** to image

```wkhtmltoimage [https://example.com] [output.png]```

**Set output dimensions**

```wkhtmltoimage --width [1024] --height [768] [input.html] [output.png]```

**Set output format** explicitly

```wkhtmltoimage --format [jpeg] [input.html] [output.jpg]```

**Set image quality** (0-100)

```wkhtmltoimage --quality [85] [input.html] [output.jpg]```

**Crop the output**

```wkhtmltoimage --crop-x [10] --crop-y [10] --crop-w [800] --crop-h [600] [input.html] [output.png]```

**Disable JavaScript**

```wkhtmltoimage --disable-javascript [input.html] [output.png]```

**Render with a zoom factor**

```wkhtmltoimage --zoom [1.5] [input.html] [output.png]```

**Allow a local HTML file** to load local images and stylesheets

```wkhtmltoimage --enable-local-file-access [input.html] [output.png]```

**Render a PNG** with a transparent background

```wkhtmltoimage --transparent [input.html] [output.png]```

**Wait for JavaScript** to finish

```wkhtmltoimage --javascript-delay [2000] [input.html] [output.png]```

# SYNOPSIS

**wkhtmltoimage** [_options_] _input_ _output_

# PARAMETERS

**--width** _int_
> Set screen width (used as guideline).

**--height** _int_
> Set screen height.

**-f**, **--format** _format_
> Output format: png, jpg, bmp, svg.

**--quality** _int_
> Output quality 0-100 (default 94, for JPEG).

**--crop-x** _int_
> X coordinate for cropping.

**--crop-y** _int_
> Y coordinate for cropping.

**--crop-w** _int_
> Width for cropping.

**--crop-h** _int_
> Height for cropping.

**--transparent**
> Make the background transparent in PNG output.

**--enable-smart-width**
> Extend **--width** to fit unbreakable content (default).

**-n**, **--disable-javascript**
> Disable JavaScript execution.

**--enable-javascript**
> Allow web pages to run JavaScript (default).

**--debug-javascript**
> Show JavaScript console output.

**--javascript-delay** _msec_
> Wait milliseconds for JavaScript to finish.

**--user-style-sheet** _path_
> Apply custom CSS stylesheet.

**--cookie** _name_ _value_
> Set a cookie (repeatable). The value should be URL encoded.

**--cookie-jar** _path_
> Read and write cookies from and to the given file.

**--post** _name_ _value_
> Add a POST field (repeatable).

**--custom-header** _name_ _value_
> Set custom HTTP header (repeatable).

**--zoom** _float_
> Zoom factor for rendering (e.g., 2.0 for 2x).

**--disable-smart-width**
> Use strict width instead of guideline.

**--encoding** _encoding_
> Set the default text encoding for input.

**-p**, **--proxy** _proxy_
> Use a proxy.

**--username** _username_
> HTTP authentication username.

**--password** _password_
> HTTP authentication password.

**--run-script** _js_
> Run additional JavaScript after the page finishes loading (repeatable).

**--load-error-handling** _handler_
> How to handle pages that fail to load: abort, ignore, or skip (default: abort).

**--load-media-error-handling** _handler_
> How to handle media files that fail to load: abort, ignore, or skip.

**--enable-local-file-access**
> Allow a local input file to read other local files.

**--disable-local-file-access**
> Block a local input file from reading other local files, unless allowed with **--allow**.

**--allow** _path_
> Allow files from the specified folder to be loaded (repeatable).

**--no-images**
> Do not load or print images.

**--stop-slow-scripts**
> Stop slow-running JavaScript.

**--window-status** _string_
> Wait until window.status equals this string before rendering.

**--log-level** _level_
> Set log level: none, error, warn, or info.

**--use-xserver**
> Use the X server instead of rendering headlessly.

**-q**, **--quiet**
> Suppress output messages (equivalent to --log-level none).

**-H**, **--extended-help**
> Display comprehensive help documentation.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**wkhtmltoimage** converts HTML pages to images using the WebKit rendering engine. It can process local HTML files or fetch remote URLs, producing PNG, JPEG, BMP, or SVG output.

Builds using the patched Qt run headlessly without requiring a display server, making it suitable for server-side image generation. It supports JavaScript execution, custom stylesheets, cookies, and HTTP authentication.

Part of the **wkhtmltopdf** suite, it shares the same rendering engine and many options with its PDF counterpart.

# CAVEATS

wkhtmltoimage is based on an older Qt WebKit version and may not render modern JavaScript frameworks correctly. For complex pages, consider alternatives like Puppeteer or Playwright. The upstream repository is archived and the project is no longer maintained: avoid rendering untrusted content. Since version 0.12.6, access to local files is blocked by default, so local pages referencing other files may need **--enable-local-file-access** or **--allow**.

# HISTORY

wkhtmltoimage was created by **Jakob Truelsen** as part of the **wkhtmltopdf** project, first released around **2008**. It leverages Qt's WebKit implementation for rendering. The project gained popularity for server-side HTML-to-PDF/image conversion. Development ended as Qt WebKit was deprecated in favor of Qt WebEngine, and the repository has since been archived.

# SEE ALSO

[wkhtmltopdf](/man/wkhtmltopdf)(1), [convert](/man/convert)(1), [puppeteer](/man/puppeteer)(1), [playwright](/man/playwright)(1)

# RESOURCES

```[Source code](https://github.com/wkhtmltopdf/wkhtmltopdf)```

```[Homepage](https://wkhtmltopdf.org/)```

```[Documentation](https://wkhtmltopdf.org/usage/wkhtmltopdf.txt)```

<!-- verified: 2026-11-09 -->
