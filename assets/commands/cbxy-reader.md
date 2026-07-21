# TAGLINE

Browser comic reader with optional guided panel view

# TLDR

**Open a comic** in the browser

```cbxy-reader [path/to/book.cbz]```

**Bind** to a specific host and port

```cbxy-reader [path/to/book.cbz] --host [127.0.0.1] --port [8765]```

**Do not open** a browser window automatically

```cbxy-reader [path/to/book.cbz] --no-open```

**Install** the cbxy tools

```uv tool install cbxy```

# SYNOPSIS

**cbxy-reader** [_options_] _comic_

# DESCRIPTION

**cbxy-reader** starts a local web server and opens a comic in the browser. If a sibling **.cbxy** sidecar is present (panel geometry produced by **cbxy-detect** or **cbxy-editor**), the reader supports guided panel-by-panel navigation; without a sidecar it shows full pages only.

Input can be a **.cbz**, **.cbr**, an image folder, or a single page image. Default bind address is **127.0.0.1** on port **8765**. Part of the **cbxy** Python package.

# PARAMETERS

_comic_
> Path to a **.cbz**, **.cbr**, image folder, or single page image.

**--host** _address_
> Bind address (default: **127.0.0.1**).

**--port** _port_
> Listen port (default: **8765**).

**--no-open**
> Do not open a browser window automatically.

# CAVEATS

Guided panel view requires a matching **.cbxy** next to the comic (or discoverable by the tool's conventions). Binding to non-localhost interfaces exposes the reader on the network—keep the default loopback bind unless you intend that. The process must stay running while you read.

# HISTORY

**cbxy** is a Python reference implementation of a comic panel geometry sidecar format by **ngafar**, published under the MIT license with **cbxy-detect**, **cbxy-reader**, and **cbxy-editor**.

# SEE ALSO

[cbxy-detect](/man/cbxy-detect)(1), [cbxy-editor](/man/cbxy-editor)(1), [pip](/man/pip)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/ngafar/cbxy)```

```[Documentation](https://github.com/ngafar/cbxy#cbxy-reader)```

<!-- verified: 2026-07-21 -->
