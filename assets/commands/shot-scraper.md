# TLDR

**Take a screenshot** of a webpage

```shot-scraper [https://example.com]```

**Take a screenshot** with custom dimensions

```shot-scraper [https://example.com] -w [800] -h [600] -o [output.png]```

**Capture a specific element** by CSS selector

```shot-scraper [https://example.com] -s '[.header]' -o [header.png]```

**Take a screenshot** with JavaScript execution before capture

```shot-scraper [https://example.com] --javascript "[document.body.style.backgroundColor = 'white']"```

**Take a retina screenshot** (2x scale)

```shot-scraper [https://example.com] --retina -o [output.png]```

**Wait for element** before taking screenshot

```shot-scraper [https://example.com] --wait-for "[document.querySelector('.loaded')]"```

**Save as JPEG** with quality setting

```shot-scraper [https://example.com] -o [output.jpg] --quality [80]```

**Interactive mode** to manually navigate before capture

```shot-scraper [https://example.com] --interactive```

# SYNOPSIS

**shot-scraper** _URL_ [_options_]

**shot-scraper** **install**

**shot-scraper** **javascript** _URL_ _script_ [_options_]

**shot-scraper** **pdf** _URL_ [_options_]

**shot-scraper** **accessibility** _URL_ [_options_]

**shot-scraper** **har** _URL_ [_options_]

# PARAMETERS

**-o**, **--output** _FILE_
> Output filename. Use **-** for stdout.

**-w**, **--width** _PIXELS_
> Browser viewport width. Default: 1280.

**-h**, **--height** _PIXELS_
> Browser viewport height. Default: full page.

**-s**, **--selector** _SELECTOR_
> CSS selector to capture instead of full page.

**--selector-all** _SELECTOR_
> Capture all elements matching the selector.

**--padding** _PIXELS_
> Add padding around selected elements.

**--js-selector** _EXPRESSION_
> JavaScript expression to filter elements.

**--wait** _MS_
> Milliseconds to wait after page load.

**--wait-for** _EXPRESSION_
> Wait until JavaScript expression is truthy.

**-j**, **--javascript** _CODE_
> Execute JavaScript before taking screenshot.

**--quality** _PERCENT_
> Save as JPEG with specified quality (1-100).

**--retina**
> Use device scale factor of 2.

**--scale-factor** _N_
> Custom device pixel ratio.

**--omit-background**
> Transparent background (PNG only).

**-b**, **--browser** _NAME_
> Browser to use: chromium, firefox, webkit, chrome.

**--browser-arg** _ARG_
> Pass command-line argument to browser.

**--user-agent** _STRING_
> Custom User-Agent header.

**-i**, **--interactive**
> Pause for manual interaction before capture.

**--bypass-csp**
> Bypass Content-Security-Policy restrictions.

**--log-requests** _FILE_
> Log HTTP requests as newline-delimited JSON.

**--timeout** _MS_
> Timeout in milliseconds before failing.

# DESCRIPTION

**shot-scraper** is a command-line utility for taking automated screenshots of websites, built on Playwright. It can capture full pages, specific elements, or execute JavaScript before capturing. The tool is designed for documentation, automated testing, and web scraping workflows.

Beyond screenshots, shot-scraper can execute JavaScript on pages and return results, generate PDFs, export accessibility trees, and capture HAR (HTTP Archive) files. It integrates well with CI/CD pipelines, particularly GitHub Actions, for generating regularly updated screenshots.

Before first use, run **shot-scraper install** to download the required browser binaries.

# CAVEATS

Requires Python and Playwright browser binaries (installed via **shot-scraper install**). Screenshots default to 1280px width and full page height, which can result in large files for long pages. JavaScript execution timing may require adjustment with **--wait** or **--wait-for** for dynamically loaded content.

# HISTORY

**shot-scraper** was created by Simon Willison and first released in **2022**. It was designed to automate documentation screenshots and web scraping tasks using Playwright's browser automation capabilities. The tool gained popularity for generating automated screenshots in CI/CD pipelines, with notable users including Reuters for data dashboards. Development continues actively with regular releases adding new features.

# SEE ALSO

[playwright](/man/playwright)(1), [puppeteer](/man/puppeteer)(1), [chromium](/man/chromium)(1), [firefox](/man/firefox)(1)
