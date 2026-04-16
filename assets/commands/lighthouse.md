# TAGLINE

google's automated web auditing tool

# TLDR

**Audit a URL**

```lighthouse [https://example.com]```

**Output to specific file**

```lighthouse [https://example.com] --output-path [report.html]```

**Output as JSON**

```lighthouse [https://example.com] --output json```

**Audit specific categories**

```lighthouse [https://example.com] --only-categories=performance,accessibility```

**Use headless Chrome**

```lighthouse [https://example.com] --chrome-flags="--headless"```

**Set viewport**

```lighthouse [https://example.com] --screenEmulation.width=[1920]```

# SYNOPSIS

**lighthouse** _url_ [_options_]

# PARAMETERS

**--output** _format_
> Output format (html, json, csv).

**--output-path** _file_
> Path to save report.

**--only-categories** _list_
> Categories to audit.

**--chrome-flags** _flags_
> Chrome launch flags.

**--preset** _preset_
> Audit preset (desktop, perf).

**--view**
> Open report in browser.

**--quiet**
> Suppress output.

**--port** _PORT_
> Port to use for the debugging protocol.

**--form-factor** _FACTOR_
> Emulate mobile or desktop (mobile|desktop).

**--save-assets**
> Save artifacts (screenshots, trace, devtoolslogs).

**--budget-path** _FILE_
> Path to a performance budget JSON file.

**--verbose**
> Enable verbose logging.

# DESCRIPTION

**lighthouse** is Google's automated web auditing tool. Tests performance, accessibility, best practices, SEO, and progressive web app features. Generates detailed reports with improvement recommendations. Simulates mobile devices by default.

Lighthouse requires a Chrome or Chromium installation which it launches to perform audits. The tool is also available built into Chrome DevTools and as a Node.js module for programmatic use in CI pipelines.

# CAVEATS

Requires Node.js and a compatible Chrome/Chromium install. Results can vary between runs due to network conditions and system load; run multiple audits for stability. Mobile emulation is used by default unless **--preset=desktop** is specified.

# HISTORY

**Lighthouse** was developed by **Google** and first released around **2016** as part of the Chrome DevTools ecosystem. Originally focused on Progressive Web Apps, it has grown into a comprehensive web quality auditing tool covering performance, accessibility, SEO, and best practices.

# SEE ALSO

[chromium](/man/chromium)(1), [google-chrome](/man/google-chrome)(1), [puppeteer](/man/puppeteer)(1)

