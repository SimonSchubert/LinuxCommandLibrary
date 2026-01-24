# TLDR

**Package game for web**

```pygbag [path/to/game]```

**Specify output directory**

```pygbag --build [path/to/game]```

**Run development server**

```pygbag --dev [path/to/game]```

**Custom archive name**

```pygbag --archive [name] [path/to/game]```

**Specify template**

```pygbag --template [template.html] [path/to/game]```

# SYNOPSIS

**pygbag** [_--build_] [_--dev_] [_options_] _path_

# PARAMETERS

**--build**
> Build only, no server.

**--dev**
> Development mode.

**--archive** _NAME_
> Archive filename.

**--template** _FILE_
> Custom HTML template.

**--cdn** _URL_
> CDN base URL.

**--title** _TITLE_
> Page title.

# DESCRIPTION

**pygbag** packages Pygame for web. It creates WebAssembly builds.

Converts Python games to browser. No plugins required.

Uses Pyodide and Emscripten. Python in WebAssembly.

Development server included. Test locally before deploy.

Async Python support. Event loop for web.

# CAVEATS

Not all Python libraries work. Async code required. Large download size.

# HISTORY

**pygbag** was created to bring Pygame games to web browsers using WebAssembly and Pyodide.

# SEE ALSO

[pygame](/man/pygame)(1), [python](/man/python)(1), [emcc](/man/emcc)(1)
