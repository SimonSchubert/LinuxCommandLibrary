# TAGLINE

captures screenshots of websites at specified viewport sizes

# TLDR

**Screenshot a website**

```pageres [https://example.com]```

**Specify viewport size** (default is 1366x768)

```pageres [https://example.com] [1024x768]```

**Multiple URLs and sizes**

```pageres [https://example.com] [https://example.org] [1024x768] [1920x1080]```

**Crop to viewport** (default is full page)

```pageres [https://example.com] [1024x768] --crop```

**Set output filename** using a template

```pageres [https://example.com] [1366x768] --filename='<%= date %> - <%= url %>'```

**Delay before capture**

```pageres [https://example.com] --delay=[3]```

**Dark mode** at 2x scale

```pageres [https://example.com] [1366x768] --darkMode --scale=[2]```

**Screenshot a local HTML file** in JPEG format

```pageres [page.html] [1366x768] --format=[jpg]```

**Capture a specific element**

```pageres [https://example.com] --selector=[.header]```

**Hide an element before capture**

```pageres [https://example.com] --hide=[.cookie-banner]```

# SYNOPSIS

**pageres** [_options_] _url_... [_size_...]

**pageres** [ _url_ _size_... [_options_] ] [ _url_ _size_... [_options_] ]

# PARAMETERS

**--filename** _TEMPLATE_
> Custom filename template (lodash template with variables such as _url_, _size_, _width_, _height_, _crop_, _date_, _time_).

**-d**, **--delay** _SECONDS_
> Delay screenshot capture (default: _0_).

**-c**, **--crop**
> Crop image to the specified viewport height (default captures the full scrolling page).

**--overwrite**
> Overwrite the file if it exists (default appends an incrementing suffix).

**--format** _FORMAT_
> Image format: _png_ (default) or _jpg_.

**--scale** _FACTOR_
> Scale webpage (device scale factor, default: _1_).

**--selector** _SELECTOR_
> Capture only the DOM element matching the CSS selector.

**--hide** _SELECTOR_
> Hide elements matching the selector before capture (repeatable).

**--clickElement** _SELECTOR_
> Click the matched element before capture.

**--css** _CSS_
> Inject custom CSS before capture.

**--cookie** _COOKIE_
> Cookie string (repeatable).

**--header** _HEADER_
> HTTP header (repeatable).

**--username** _USER_
> HTTP basic auth username.

**--password** _PASS_
> HTTP basic auth password.

**--transparent**
> Use a transparent background instead of white.

**--darkMode**
> Emulate the user's dark color scheme preference.

**--timeout** _SECONDS_
> Request timeout in seconds (default: _60_).

**-v**, **--verbose**
> Print detailed error output.

# DESCRIPTION

**pageres** captures screenshots of websites at specified viewport sizes. It's useful for responsive design testing. URLs and sizes can be given in any order; the URL may also be a local file path. Screenshots are saved in the current directory.

Multiple viewport sizes can be specified in a single command. Each size produces a separate image. Arguments can be grouped with square brackets, and options inside a group override the outer ones.

Full-page screenshots capture content below the fold. Cropping limits output to visible viewport.

Delays allow JavaScript and animations to complete. Custom CSS can hide or modify elements.

Output supports PNG and JPEG formats. Filenames can include URL and size variables.

# CAVEATS

Requires Node.js; screenshots are taken with headless Chrome via Puppeteer. Device keywords (e.g. _iphone 5s_) were removed in pageres 9.0, use explicit sizes instead. There is no output directory option, so **cd** into the target directory first. JavaScript-heavy sites may need delays. Some sites block automated screenshots.

# HISTORY

**pageres** was created by **Sindre Sorhus** for responsive design testing. It provides a command-line interface for website screenshot automation.

# SEE ALSO

[chromium](/man/chromium)(1), [puppeteer](/man/puppeteer)(1), [shot-scraper](/man/shot-scraper)(1)

# RESOURCES

```[Source code](https://github.com/sindresorhus/pageres-cli)```

<!-- verified: 2026-11-23 -->
