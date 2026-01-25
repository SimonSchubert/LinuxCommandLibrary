# TLDR

**Configure project**

```node-gyp configure```

**Build native addon**

```node-gyp build```

**Clean build files**

```node-gyp clean```

**Rebuild (clean + configure + build)**

```node-gyp rebuild```

**Install Node.js headers**

```node-gyp install```

**Specify Node.js version**

```node-gyp rebuild --target=[18.0.0]```

# SYNOPSIS

**node-gyp** _command_ [_options_]

# PARAMETERS

**configure**
> Generate build files.

**build**
> Build native addon.

**clean**
> Remove build directory.

**rebuild**
> Full rebuild.

**install**
> Install Node.js headers.

**--target** _version_
> Node.js version.

**--debug**
> Debug build.

**--arch** _arch_
> Target architecture.

# DESCRIPTION

**node-gyp** is a cross-platform build tool for compiling Node.js native addon modules. It uses GYP (Generate Your Projects) to create platform-specific build files.

node-gyp requires Python and a C++ compiler (like gcc, clang, or MSVC).

# BINDING.GYP

```json
{
  "targets": [{
    "target_name": "addon",
    "sources": ["src/addon.cc"],
    "include_dirs": [
      "<!(node -p \"require('node-addon-api').include\")"
    ]
  }]
}
```

# CAVEATS

Requires Python 3.x. Needs C++ build tools. Different requirements per OS. May need --python flag.

# HISTORY

node-gyp was created by **Nathan Rajlich** (TooTallNate) to simplify building native Node.js addons across platforms.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1), [cmake-js](/man/cmake-js)(1)
