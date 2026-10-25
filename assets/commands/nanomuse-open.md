# TAGLINE

Open a page for the user in the nanoMuse app browser

# TLDR

Hand the user a **sign-in** or **payment** page

```nanomuse-open [https://example.com/login]```

Print the raw **JSON** result

```nanomuse-open [https://example.com/pay] --json```

# SYNOPSIS

**nanomuse-open** _url_ [**--json**]

# PARAMETERS

_url_
> Page to open. This is the user's browser in the app (the phone's browser for the root filesystem), for something they have to do themselves.

**--json**
> Print the raw result object. Exit **0** when `ok` is true, **1** otherwise.

# DESCRIPTION

**nanomuse-open** is a console script from the **nanomuse** package. The entry point is:

```
nanomuse.bridge.cli:open_main
```

While **nanomuse serve** runs an agent command, it posts `{"url": ...}` to `/api/bridge/open` and prints the answer. It uses only the Python standard library.

The server sets the bridge URL and a one-call token for that command. Both must be present:

```
NANOMUSE_BRIDGE
NANOMUSE_BRIDGE_TOKEN
```

The request is sent with header `X-Nanomuse-Bridge` and a **600** second timeout. A text success prints the `output` field.

# CAVEATS

This does not drive the page. Use **nanomuse-browser** to navigate, click, and type. **nanomuse-open** only puts the URL in front of the user.

Outside an agent command, the program exits **2**. A bridge error exits **1**.

# SEE ALSO

[nanomuse](/man/nanomuse)(1), [nanomuse-browser](/man/nanomuse-browser)(1), [nanomuse-device](/man/nanomuse-device)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/nano-muse/nanoMuse)```

```[Homepage](https://nanomuse.cn)```

```[Documentation](https://nanomuse.cn/docs/)```

<!-- verified: 2026-10-25 -->
