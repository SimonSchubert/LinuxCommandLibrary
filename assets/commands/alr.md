# TAGLINE

Ada/SPARK source package manager.

# TLDR

**Search** for a crate

```alr search [package_name]```

**Show** available versions

```alr show [package_name]```

**Get** a crate

```alr get [package_name]```

**Initialize** a new crate

```alr init --bin [project_name]```

**Build** current project

```alr build```

**Run** current project

```alr run```

# SYNOPSIS

**alr** _command_ [_options_] [_arguments_]

# DESCRIPTION

**alr** is the Alire package manager for the Ada programming language. It provides crate (package) management similar to Cargo for Rust or npm for Node.js, handling dependencies, building, and publishing Ada projects.

Alire connects to the community-maintained crate index, enabling easy discovery and integration of Ada libraries and tools.

# PARAMETERS

**search** _term_
> Search for crates matching term

**show** _crate_
> Display information about a crate

**get** _crate_
> Download and set up a crate

**init**
> Initialize a new project

**build**
> Build the current project

**run**
> Build and run the current project

**with** _crate_
> Add a dependency to current project

**publish**
> Publish crate to the index

**update**
> Update dependencies to latest versions

**--help**
> Show help for command

# CAVEATS

Requires GNAT Ada compiler to be installed. Some crates may have platform-specific dependencies. The crate index is community-maintained and separate from commercial Ada tool vendors.

# HISTORY

**Alire** was developed by the Ada community, with the first stable release around **2020**. It modernizes Ada development with package management comparable to other contemporary languages.

# SEE ALSO

[gnatmake](/man/gnatmake)(1), [gprbuild](/man/gprbuild)(1), [cargo](/man/cargo)(1)
