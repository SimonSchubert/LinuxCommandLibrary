# TAGLINE

In-app browser for a nanoMuse agent command

# TLDR

Open a **URL**

```nanomuse-browser navigate [https://example.com]```

Read the page as text, with **numbered** controls

```nanomuse-browser extract```

**Click** element 3, then type and submit

```nanomuse-browser click [3]```

```nanomuse-browser type [3] "[query]" --submit```

**Scroll**, go **back**, or **wait** for a page that is still drawing

```nanomuse-browser scroll down```

```nanomuse-browser back```

```nanomuse-browser wait [1.5]```

Save a **screenshot**, or GET a URL with the browser's cookies

```nanomuse-browser screenshot```

```nanomuse-browser fetch [https://example.com/account]```

POST a body, or switch the **profile**, then close

```nanomuse-browser fetch [https://example.com/api] --post "[payload]"```

```nanomuse-browser profile mobile --width [390] --height [844]```

```nanomuse-browser close```

# SYNOPSIS

**nanomuse-browser** [**--json**] _action_ [_arguments_]

# PARAMETERS

**--json**
> Print the raw result object instead of the text output.

**navigate** _url_
> Open _url_ in the app's browser. The user sees the same page and can take over.

**extract**
> Page text, with interactive elements numbered for **click** and **type**.

**click** _index_
> Click element _index_ from the last **extract**.

**type** _index_ _text_ [**--submit**]
> Type _text_ into element _index_. **--submit** presses Enter afterwards.

**press** _key_
> Press a key, for example **Enter**.

**scroll** **up**|**down**
> Scroll the page.

**back**
> Go back one page.

**wait** [_seconds_]
> Pause so a page that is still drawing can finish. _seconds_ is optional.

**screenshot**
> Save a picture of the page and print the path.

**fetch** _url_ [**--post** _body_]
> GET _url_ with the browser's cookies (so a signed-in session is used) and print the raw body. **--post** sends _body_ as a POST instead.

**profile** [**mobile**|**desktop**] [**--user-agent** _ua_] [**--width** _n_] [**--height** _n_]
> How the browser presents itself. The profile name may be omitted when only the size or user agent changes.

**close**
> Close the browser.

# DESCRIPTION

**nanomuse-browser** is a console script from the **nanomuse** package. The entry point is:

```
nanomuse.bridge.cli:browser_main
```

While **nanomuse serve** runs an agent command, this program posts one JSON request to `/api/bridge/browser` and prints the answer. The action name and its arguments are the JSON body. It uses only the Python standard library.

The bridge URL and token are supplied by the server for that command. The two variable names, which must both be set:

```
NANOMUSE_BRIDGE
NANOMUSE_BRIDGE_TOKEN
```

A text success prints the `output` field. Image paths are printed as `[image]` lines. Errors go to stderr.

# CAVEATS

Outside an agent command from **nanomuse serve**, the bridge variables are unset and the program exits **2**. A bridge error exits **1**. **--json** prints the object either way and exits **1** when `ok` is false.

The request timeout is **600** seconds. This drives the in-app browser the user can see; it is not a separate Playwright process.

# SEE ALSO

[nanomuse](/man/nanomuse)(1), [nanomuse-device](/man/nanomuse-device)(1), [nanomuse-open](/man/nanomuse-open)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/nano-muse/nanoMuse)```

```[Homepage](https://nanomuse.cn)```

```[Documentation](https://nanomuse.cn/docs/)```

<!-- verified: 2026-10-25 -->
