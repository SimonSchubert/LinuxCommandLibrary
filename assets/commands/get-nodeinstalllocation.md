# TAGLINE

Print the installation path of the active Node.js version

# TLDR

**Print the path** of the currently active Node.js installation

```get-nodeinstalllocation```

# SYNOPSIS

**get-nodeinstalllocation**

# DESCRIPTION

**get-nodeinstalllocation** is a helper shim that outputs the absolute filesystem path of the Node.js installation currently on the user's **PATH**. It is typically provided by Node.js version managers or distribution packaging scripts so that tooling (installers, build systems, editor integrations) can locate the active Node.js tree without parsing environment variables.

The equivalent query using plain Node.js is `node -e "console.log(process.execPath)"` or, on POSIX systems, `dirname "$(readlink -f "$(command -v node)")"`.

# CAVEATS

This is a vendor-specific wrapper rather than an upstream Node.js command. Behavior depends on how your Node.js was installed; if no such script exists on your system, prefer `which node` / `command -v node` or `node -p "process.execPath"` to obtain the same information.

# SEE ALSO

[node](/man/node)(1), [which](/man/which)(1), [readlink](/man/readlink)(1)

