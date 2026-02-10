# TAGLINE

captures screenshots of websites at specified viewport sizes

# TLDR

**Screenshot a website**

```pageres [https://example.com]```

**Specify viewport size**

```pageres [https://example.com] [1024x768]```

**Multiple sizes**

```pageres [https://example.com] [1024x768] [1920x1080]```

**Capture full page**

```pageres [https://example.com] --crop=false```

**Set output filename**

```pageres [https://example.com] --filename=[screenshot]```

**Delay before capture**

```pageres [https://example.com] --delay=[3]```

**Set output directory**

```pageres [https://example.com] -d [./screenshots]```

# SYNOPSIS

**pageres** [_options_] _url_ [_sizes_...]

# PARAMETERS

**-d**, **--dest** _DIR_
> Output directory.

**--filename** _TEMPLATE_
> Filename template.

**--delay** _SECONDS_
> Delay before screenshot.

**--crop**
> Crop to viewport size.

**--overwrite**
> Overwrite existing files.

**--format** _FORMAT_
> Image format (png/jpg).

**--scale** _FACTOR_
> Scale factor.

**--css** _CSS_
> Custom CSS.

**--cookie** _COOKIE_
> Cookie string.

**--header** _HEADER_
> HTTP header.

**--user-agent** _UA_
> User agent string.

# DESCRIPTION

**pageres** captures screenshots of websites at specified viewport sizes. It's useful for responsive design testing.

Multiple viewport sizes can be specified in a single command. Each size produces a separate image.

Full-page screenshots capture content below the fold. Cropping limits output to visible viewport.

Delays allow JavaScript and animations to complete. Custom CSS can hide or modify elements.

Output supports PNG and JPEG formats. Filenames can include URL and size variables.

# CAVEATS

Requires headless Chrome/Chromium. JavaScript-heavy sites may need delays. Some sites block automated screenshots.

# HISTORY

**pageres** was created by **Sindre Sorhus** for responsive design testing. It provides a command-line interface for website screenshot automation.

# SEE ALSO

[chromium](/man/chromium)(1), [puppeteer](/man/puppeteer)(1), [shot-scraper](/man/shot-scraper)(1)
