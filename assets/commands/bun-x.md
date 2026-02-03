# TLDR

**Run a package binary** without installing

```bun x [package]```

**Run a specific version**

```bun x [package]@[version]```

**Pass arguments** to the command

```bun x [package] -- [args...]```

**Run create-* packages**

```bun x create-[template] [project-name]```

# SYNOPSIS

**bun** **x** [_options_] _package_ [_args..._]

# DESCRIPTION

**bun x** runs a package's binary without permanently installing it. It's similar to **npx** but significantly faster due to Bun's caching and native implementation.

If the package is already installed locally or globally, it uses that version. Otherwise, it downloads and caches the package temporarily.

Common use cases include running scaffolding tools (create-react-app, create-next-app), one-off utilities, and trying packages before installing.

# CAVEATS

Packages are cached but may be removed during cache cleanup. For frequently used tools, consider installing globally with **bun i -g**.

# SEE ALSO

[bun](/man/bun)(1), [bun-run](/man/bun-run)(1), [npx](/man/npx)(1)
