# TAGLINE

Package Pygame games for web browsers

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

**pygbag** packages Pygame applications for deployment in web browsers by compiling Python code to WebAssembly using Emscripten and Pyodide. The resulting build runs directly in modern browsers without plugins, making it straightforward to share Python games and multimedia applications online.

The tool includes a built-in development server for local testing before deployment. Games must use async Python patterns with **asyncio** to work within the browser's event loop model. pygbag handles asset bundling, HTML template generation, and the WebAssembly compilation pipeline, producing a self-contained web application from a standard Pygame project.

# CAVEATS

Not all Python libraries work. Async code required. Large download size.

# HISTORY

**pygbag** was created to bring Pygame games to web browsers using WebAssembly and Pyodide.

# SEE ALSO

[pygame](/man/pygame)(1), [python](/man/python)(1), [emcc](/man/emcc)(1)
