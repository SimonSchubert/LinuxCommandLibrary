# TAGLINE

Package Pygame games for web browsers

# TLDR

**Package a game** and serve it on http://localhost:8000

```pygbag [path/to/game]```

**Build only**, without starting the test server

```pygbag --build [path/to/game]```

**Create a zip archive** for itch.io at build/web.zip

```pygbag --archive [path/to/game]```

**Start without waiting** for user interaction

```pygbag --ume_block 0 [path/to/game]```

**Use a custom port** for the test server

```pygbag --port [8080] [path/to/game]```

**Use a custom HTML template**

```pygbag --template [template.tmpl] [path/to/game]```

**Show all options**

```pygbag --help [path/to/game]```

# SYNOPSIS

**pygbag** [_options_] _path_

# PARAMETERS

**--build**
> Build only, do not run the test server.

**--archive**
> Create a build/web.zip archive for itch.io.

**--html**
> Build as HTML with embedded assets (pygame-script).

**--no_opt**
> Turn off the assets optimizer.

**--template** _FILE_
> index.html template (default: default.tmpl).

**--icon** _FILE_
> Favicon PNG, at least 32x32 (default: favicon.png).

**--title** _TITLE_
> Human-readable application title.

**--app_name** _NAME_
> User-facing application name (default: folder name).

**--package** _NAME_
> Package name, should be unique.

**--ume_block** _N_
> Wait for user media engagement before running (default: 1).

**--can_close** _N_
> Ask for confirmation when closing the window (default: 0).

**--width** _N_, **--height** _N_
> Framebuffer size.

**--bind** _ADDRESS_
> Test server bind address (default: localhost).

**--port** _PORT_
> Test server port (default: 8000).

**--ssl** _VALUE_
> Enable SSL with server.pem and key.pem.

**--PYBUILD** _VERSION_
> Python version to target.

**--version** _VERSION_
> Override the prebuilt runtime version path.

**--cdn** _URL_
> Website to cache the runtime locally from.

**--cache** _DIR_
> md5-based URL cache directory.

**--ini**
> Initialize an example pygbag.ini configuration file.

**--disable-sound-format-error**
> Do not raise an exception for unsupported audio formats found in the assets.

**--dev**
> Developer option: change the port to 8666 and use a local build served on port 8000.

# DESCRIPTION

**pygbag** packages Python and Pygame applications for modern web browsers, including mobile versions, using a CPython runtime compiled to WebAssembly. The application folder is bundled into **build/web** and runs without plugins.

The tool includes a test server for local checks before deployment. The runtime is fetched from a CDN and cached locally. Adding **?-i** to the local URL opens a terminal with a REPL and a smaller canvas.

# CAVEATS

Not all Python libraries are supported in the WebAssembly environment; C extensions must be specifically compiled for it. The folder must contain a **main.py** whose main loop is async, with `await asyncio.sleep(0)` in every iteration. Avoid code after `asyncio.run(main())`, since the call does not block in the browser. The test server is not designed for security or performance, and resulting builds can be large due to the Python runtime.

# HISTORY

**pygbag** is developed by the **pygame-web** project to bring Pygame games to web browsers using WebAssembly.

# SEE ALSO

[pygame](/man/pygame)(1), [python](/man/python)(1), [emcc](/man/emcc)(1)

# RESOURCES

```[Source code](https://github.com/pygame-web/pygbag)```

```[Documentation](https://pygame-web.github.io/)```

<!-- verified: 2026-11-09 -->
