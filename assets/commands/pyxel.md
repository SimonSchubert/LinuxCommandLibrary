# TAGLINE

Retro game engine and resource editor for Python

# TLDR

**Run** a game script

```pyxel run [01_hello_pyxel.py]```

**Rerun** when files in a directory change

```pyxel watch [.] [game.py]```

**Edit** sprites, tilemaps, and sound (creates the file if missing)

```pyxel edit [my_resource.pyxres]```

**Package** a directory into a **.pyxapp**

```pyxel package [src] [src/main.py]```

**Play** a packaged app

```pyxel play [game.pyxapp]```

Copy the **bundled examples** into **./pyxel_examples**

```pyxel copy_examples```

# SYNOPSIS

**pyxel**

**pyxel run** _script.py_

**pyxel watch** _directory_ _script.py_

**pyxel play** _app.pyxapp_

**pyxel edit** [_resource.pyxres_]

**pyxel package** _app_dir_ _startup.py_

**pyxel app2exe** _app.pyxapp_

**pyxel app2html** _app.pyxapp_

**pyxel copy_examples**

# PARAMETERS

**run** _script.py_
> Run a Python file. A missing **.py** suffix is added. The script's directory is put on **sys.path**.

**watch** _directory_ _script.py_
> Run _script.py_ and restart it when any file under _directory_ changes. Stop with **Ctrl+C** (**Cmd+C** on macOS). The script must live inside _directory_.

**play** _app.pyxapp_
> Unpack and run a Pyxel application file. **.pyxapp** is added when the name has no suffix. A **.zip** path is accepted as-is.

**edit** [_resource.pyxres_]
> Open the image, tilemap, sound, and music editors. Omitted name becomes **my_resource.pyxres**. A missing file is created. A missing **.pyxres** suffix is added.

**package** _app_dir_ _startup.py_
> Write _app_dir_**.pyxapp** (a zip) in the current directory. _startup.py_ must be inside _app_dir_. Comment headers in that file (**title**, **author**, **desc**, **site**, **license**, **version**) are stored as zip metadata and printed by **play**. **.gif**, **.zip**, and **__pycache__** are left out.

**app2exe** _app.pyxapp_
> Build a windowed executable with PyInstaller. Fails if PyInstaller is not installed.

**app2html** _app.pyxapp_
> Write _name_**.html** in the current directory. The page loads Pyxel's web runtime and embeds the **.pyxapp**.

**copy_examples**
> Replace **./pyxel_examples** with the examples shipped in the package.

# DESCRIPTION

**pyxel** is the command installed with the Pyxel Python library, a retro game engine with a fixed 16-color palette, four sound channels, image banks, and tilemaps. Games are ordinary Python scripts (**import pyxel**, then **pyxel.init** and **pyxel.run**). The same command opens the bundled resource editor and packs a project for other machines or for the browser.

With no arguments it prints the version and the command list.

While a game or the editor is running: **Esc** quits; **Alt+1** saves a screenshot to the desktop; **Alt+3** saves up to 10 seconds of capture; **Alt+Enter** toggles fullscreen; **Alt+0** toggles the performance monitor. On macOS the **Alt** shortcuts use **Option**.

# CAVEATS

Needs Python 3.11 or newer. The **pyxel** command comes from **pip install pyxel** (or a distro package of that project), not from the Python standard library. Games open a graphical window; this is not a terminal game. **watch** errors if the script is outside the watched directory. **app2exe** depends on PyInstaller and writes build files in the working directory. **app2html** needs network access when the page is opened, because it loads the web runtime from a CDN pinned to the installed Pyxel version.

# INSTALL

```nix: nix profile install nixpkgs#pyxel```

<!-- packages: 2026-10-02 -->

# SEE ALSO

[python](/man/python)(1), [pygame](/man/pygame)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/kitao/pyxel)```

```[Documentation](https://kitao.github.io/pyxel/web/user-guide/)```

<!-- verified: 2026-10-02 -->
