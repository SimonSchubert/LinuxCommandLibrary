# TAGLINE

Phone capabilities for a nanoMuse agent command

# TLDR

List what the connected phone can do

```nanomuse-device list```

Read the **clipboard**

```nanomuse-device clipboard read```

Set an **alarm**

```nanomuse-device alarm set hour=7 minute=30 message=Train```

Post a **notification** (no action word)

```nanomuse-device notify title=Done body=Booked```

Print the raw **JSON** result

```nanomuse-device --json clipboard read```

# SYNOPSIS

**nanomuse-device** **list** [**--json**]

**nanomuse-device** _capability_ [_action_] [_key=value_...] [**--json**]

# PARAMETERS

_capability_
> **clipboard**, **calendar**, **alarm**, **timer**, **contacts**, **location**, **notify**, **photo**, or **list**. **list** with no action prints one capability per line.

_action_
> **read**, **write**, **list**, **create**, **set**, **search**, **pick**, and similar. Omit it for **notify**, **location**, and **calendars**. If this word contains `=`, it is treated as a _key=value_ and there is no action.

_key=value_
> Arguments for that capability. A value that is JSON (a number, **true**, **false**, or an array) is parsed; anything else stays text. A hyphen in a name is normalized before the request.

**--json**
> Print the raw result object. Exit **0** when `ok` is true, **1** otherwise.

# DESCRIPTION

**nanomuse-device** is a console script from the **nanomuse** package. The entry point is:

```
nanomuse.bridge.cli:device_main
```

It is the phone side of the bridge the agent uses while **nanomuse serve** is running a shell or Python command. The server injects the bridge URL and a one-call token; this program posts one JSON request and prints the answer. It uses only the Python standard library. Both of these must be set:

```
NANOMUSE_BRIDGE
NANOMUSE_BRIDGE_TOKEN
```


**list** calls `GET /api/bridge/tools`. Any other invocation posts to `/api/bridge/device` with a tool name built from the capability and the optional action. A successful text result is the `output` field; image paths are printed as `[image]` lines. Errors go to stderr.

Outside that agent command the bridge variables are unset and the program exits **2**.

# CAVEATS

This is not a standalone phone client. With no phone connected, **list** prints that and exits **1**. A missing or refused bridge (HTTP error, or the server not reachable) is an error result, exit **1**, unless **--json** is set, which still exits **1** when `ok` is false.

The request timeout is **600** seconds. The token lasts for that agent command plus a short grace period, then the server forgets it.

# SEE ALSO

[nanomuse](/man/nanomuse)(1), [nanomuse-cloud](/man/nanomuse-cloud)(1), [nanomuse-browser](/man/nanomuse-browser)(1), [nanomuse-open](/man/nanomuse-open)(1), [python](/man/python)(1)

# RESOURCES

```[Source code](https://github.com/nano-muse/nanoMuse)```

```[Homepage](https://nanomuse.cn)```

```[Documentation](https://nanomuse.cn/docs/)```

<!-- verified: 2026-10-25 -->
