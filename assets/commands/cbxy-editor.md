# TAGLINE

Browser UI to create or edit comic panel boxes

# TLDR

**Edit panel boxes** for a comic in the browser

```cbxy-editor [path/to/book.cbz]```

**Bind** to a specific host and port

```cbxy-editor [path/to/book.cbz] --host [127.0.0.1] --port [8766]```

**Do not open** a browser window automatically

```cbxy-editor [path/to/book.cbz] --no-open```

**Install** the cbxy tools

```pip install cbxy```

# SYNOPSIS

**cbxy-editor** [_options_] _comic_

# DESCRIPTION

**cbxy-editor** starts a local web UI to create or correct panel rectangles and save a **.cbxy** sidecar beside the comic. Use it after automatic detection with **cbxy-detect**, or to author panel geometry from scratch. Coordinates are stored as normalized page fractions in per-page JSON inside the **.cbxy** ZIP.

Input can be a **.cbz**, **.cbr**, an image folder, or a single page image. Default bind address is **127.0.0.1** on port **8766** (distinct from **cbxy-reader**'s default **8765**). Part of the **cbxy** Python package.

# PARAMETERS

_comic_
> Path to a **.cbz**, **.cbr**, image folder, or single page image.

**--host** _address_
> Bind address (default: **127.0.0.1**).

**--port** _port_
> Listen port (default: **8766**).

**--no-open**
> Do not open a browser window automatically.

# CAVEATS

The editor is a local browser UI, not a headless batch tool—use **cbxy-detect** for automated pipelines. Binding beyond loopback exposes the editor on the network. Saved **.cbxy** files should stay paired with the matching comic archive for **cbxy-reader** guided mode.

# HISTORY

**cbxy** is a Python reference implementation of a comic panel geometry sidecar format by **ngafar**, published under the MIT license with **cbxy-detect**, **cbxy-reader**, and **cbxy-editor**.

# SEE ALSO

[cbxy-detect](/man/cbxy-detect)(1), [cbxy-reader](/man/cbxy-reader)(1), [pip](/man/pip)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/ngafar/cbxy)```

```[Documentation](https://github.com/ngafar/cbxy#cbxy-editor)```

<!-- verified: 2026-07-21 -->
