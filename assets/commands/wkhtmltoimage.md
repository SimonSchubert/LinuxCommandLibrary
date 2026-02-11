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

**-n**, **--disable-javascript**
> Disable JavaScript execution.

**--javascript-delay** _msec_
> Wait milliseconds for JavaScript to finish.

**--user-style-sheet** _path_
> Apply custom CSS stylesheet.

**--cookie** _name_ _value_
> Set a cookie (repeatable).

**--custom-header** _name_ _value_
> Set custom HTTP header (repeatable).

**--disable-smart-width**
> Use strict width instead of guideline.

**-q**, **--quiet**
> Suppress output messages.

**-V**, **--version**
> Display version information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**wkhtmltoimage** converts HTML pages to images using the WebKit rendering engine. It can process local HTML files or fetch remote URLs, producing PNG, JPEG, BMP, or SVG output.

The tool runs headlessly without requiring a display server, making it suitable for server-side image generation. It supports JavaScript execution, custom stylesheets, cookies, and HTTP authentication.

Part of the **wkhtmltopdf** suite, it shares the same rendering engine and many options with its PDF counterpart.

# CAVEATS

wkhtmltoimage is based on an older Qt WebKit version and may not render modern JavaScript frameworks correctly. For complex pages, consider alternatives like Puppeteer or Playwright. The project is in maintenance mode with limited updates.

# HISTORY

wkhtmltoimage was created by **Jakob Truelsen** as part of the **wkhtmltopdf** project, first released around **2008**. It leverages Qt's WebKit implementation for rendering. The project gained popularity for server-side HTML-to-PDF/image conversion. Development has slowed as the underlying Qt WebKit has been deprecated in favor of Qt WebEngine.

# SEE ALSO

[wkhtmltopdf](/man/wkhtmltopdf)(1), [convert](/man/convert)(1), [chromium](/man/chromium)(1)
