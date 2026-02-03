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

# DESCRIPTION

**lighthouse** is Google's automated web auditing tool. Tests performance, accessibility, best practices, SEO, and progressive web app features. Generates detailed reports with improvement recommendations. Simulates mobile devices by default.

# SEE ALSO

[chromium](/man/chromium)(1), [puppeteer](/man/puppeteer)(1)

