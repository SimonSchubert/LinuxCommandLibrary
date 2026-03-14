# TAGLINE

Headless browser designed for AI and automation

# TLDR

**Fetch a URL** and dump the rendered HTML to stdout

```lightpanda fetch --dump html [url]```

**Fetch a URL** and output as **markdown**

```lightpanda fetch --dump markdown [url]```

**Start a CDP server** on the default host and port

```lightpanda serve```

**Start a CDP server** on a specific host and port

```lightpanda serve --host [127.0.0.1] --port [9222]```

**Fetch a URL** while obeying robots.txt

```lightpanda fetch --obey_robots --dump html [url]```

**Fetch a URL** through an HTTP proxy

```lightpanda fetch --http_proxy [proxy_host:port] --dump html [url]```

# SYNOPSIS

**lightpanda** _command_ [_options_] [_url_]

# PARAMETERS

**fetch**
> Fetch a URL, execute JavaScript, and output the rendered page content to stdout.

**serve**
> Start a Chrome DevTools Protocol (CDP) server for remote automation via Playwright, Puppeteer, or raw CDP clients.

**help**
> Display available commands and options.

**--dump** _html_|_markdown_
> Output format for the fetched page. Use **html** for rendered HTML or **markdown** for a Markdown conversion. (fetch only)

**--with_base**
> Add a **\<base\>** tag in the dumped output. (fetch only)

**--host** _address_
> Host address for the CDP server. Default **127.0.0.1**. (serve only)

**--port** _port_
> Port for the CDP server. Default **9222**. (serve only)

**--timeout** _seconds_
> Inactivity timeout in seconds before disconnecting clients. Default **10**. (serve only)

**--obey_robots**
> Fetch and obey the robots.txt of the target web pages.

**--http_proxy** _host:port_
> HTTP proxy to use for all requests. Supports optional **username:password** for basic authentication.

**--http_timeout** _milliseconds_
> Maximum time in milliseconds the transfer is allowed to complete. **0** means no timeout. Default **10000**.

**--log_level** _level_
> Set logging verbosity. Default **info**. Use **debug** for detailed output.

**--log_format** _format_
> Set log output format. Use **pretty** for human-readable output.

# DESCRIPTION

**Lightpanda** is an open-source headless browser built from scratch in **Zig** with the **V8** JavaScript engine, purpose-built for AI agents, web scraping, LLM training, and test automation. Unlike headless modes of traditional browsers, Lightpanda skips graphical rendering entirely, focusing only on DOM construction and JavaScript execution.

It exposes a **Chrome DevTools Protocol** (CDP) endpoint, making it compatible with existing automation tools like **Playwright**, **Puppeteer**, and **chromedp** as a drop-in replacement for headless Chrome. The **fetch** command retrieves a single URL and dumps the rendered page, while **serve** launches a persistent CDP server for remote browser control.

Lightpanda achieves **9x less memory usage** and **11x faster execution** compared to headless Chrome, making it particularly suited for high-volume scraping and automation workloads.

# CAVEATS

Lightpanda is in **beta** and does not yet implement the full web platform. Complex web applications that rely on advanced CSS layout, canvas, WebGL, or certain newer Web APIs may not work correctly. Windows is not natively supported; use WSL instead. As a non-Chromium browser, some sites with browser fingerprinting may behave differently.

# HISTORY

Lightpanda was created by **Francis** and **Pierre**, who previously worked on large-scale web scraping using headless Chrome and found it too resource-heavy for high-volume workloads. They spent over **two years** building a headless browser from scratch in **Zig**, choosing the language for its low-level control and performance characteristics. The project was publicly announced on **Hacker News in early 2025** and released as open source under the **AGPL-3.0** license.

# SEE ALSO

[chromium](/man/chromium)(1), [curl](/man/curl)(1), [wget](/man/wget)(1), [puppeteer](/man/puppeteer)(1)
