# TLDR

**Run a package without installing**

```yarn dlx [create-react-app] [my-app]```

**Run a specific package version**

```yarn dlx [gatsby]@[4.0.0] new [my-site]```

**Run a command from a different package**

```yarn dlx -p [typescript] tsc --version```

**Run with quiet output**

```yarn dlx -q [cowsay] "Hello"```

**Scaffold a Next.js app**

```yarn dlx create-next-app [my-app]```

**Run ESLint initialization**

```yarn dlx eslint --init```

# SYNOPSIS

**yarn dlx** [_-p package_] [_-q_] _command_ [_args_]

# PARAMETERS

**-p** _package_, **--package** _package_
> Install and run command from specified package instead of inferring from command name

**-q**, **--quiet**
> Suppress informational output during execution

# DESCRIPTION

**yarn dlx** runs a package in a temporary environment without permanently installing it. This is the Yarn equivalent of **npx**, useful for one-off commands like project scaffolding tools.

The command downloads the specified package to a temporary location, executes it, and cleans up afterward. It's commonly used with generators like create-react-app, create-next-app, and gatsby that create new project structures.

By default, yarn dlx uses the command name to determine which package to install. Use **-p** to specify a different package when the command name differs from the package name.

# CAVEATS

yarn dlx is available in Yarn 2+ (Berry) only; Yarn 1.x does not include this command. Using dlx for packages needed repeatedly is not recommended since Yarn doesn't track dlx-installed packages, making builds non-deterministic. For repeated use, install packages normally with **yarn add**.

# HISTORY

yarn dlx was introduced in **Yarn 2** (Berry) released in **2020** as part of the modernized Yarn architecture. It provides functionality similar to npx but integrated with Yarn's package resolution and caching system.

# SEE ALSO

[yarn](/man/yarn)(1), [npx](/man/npx)(1), [npm](/man/npm)(1)
