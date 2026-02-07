# TAGLINE

WebKit web page to image converter

# TLDR

**Capture webpage as PNG**

```cutycapt --url=[https://example.com] --out=[screenshot.png]```

**Capture as PDF**

```cutycapt --url=[https://example.com] --out=[page.pdf]```

**Set viewport size**

```cutycapt --url=[url] --out=[out.png] --min-width=[1920] --min-height=[1080]```

**Capture with delay**

```cutycapt --url=[url] --out=[out.png] --delay=[2000]```

**Disable JavaScript**

```cutycapt --url=[url] --out=[out.png] --javascript=off```

**Run headless with Xvfb**

```xvfb-run cutycapt --url=[url] --out=[out.png]```

# SYNOPSIS

**cutycapt** --url=_url_ --out=_file_ [_options_]

# DESCRIPTION

**cutycapt** captures WebKit rendering of web pages to images or documents. Supports PNG, JPEG, PDF, SVG, PS, and other formats. Uses Qt WebKit engine for rendering.

# PARAMETERS

**--url** _url_
> URL to capture (http://, file://, etc.)

**--out** _file_
> Output file path

**--out-format** _format_
> Output format (overrides extension)

**--min-width** _pixels_
> Minimum width (default: 800)

**--min-height** _pixels_
> Minimum height (default: 600)

**--max-width** _pixels_
> Maximum width

**--max-height** _pixels_
> Maximum height

**--delay** _ms_
> Delay after load (default: 0)

**--max-wait** _ms_
> Maximum wait time (default: 90000)

**--zoom** _factor_
> Zoom factor

**--javascript** on|off
> Enable/disable JavaScript

**--plugins** on|off
> Enable/disable plugins

**--proxy** _host:port_
> HTTP proxy

**--header** _name:value_
> Custom request header

**--method** get|post|put
> HTTP method

# OUTPUT FORMATS

svg, pdf, ps, png, jpeg, tiff, gif, bmp, mng, ppm, xbm, xpm

# CAVEATS

Requires X server. Use xvfb-run for headless environments. Based on older Qt WebKit (not Chromium).

# SEE ALSO

[wkhtmltoimage](/man/wkhtmltoimage)(1), [chromium](/man/chromium)(1), [firefox](/man/firefox)(1)
