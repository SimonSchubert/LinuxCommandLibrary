# TAGLINE

prints the folder where npm will install executables

# TLDR

**Show local bin directory**

```npm bin```

**Show global bin directory**

```npm bin -g```

**Add local bin to PATH**

```export PATH="$(npm bin):$PATH"```

# SYNOPSIS

**npm bin** [_options_]

# PARAMETERS

**-g**, **--global**
> Show global bin directory.

# DESCRIPTION

**npm bin** prints the folder where npm will install executables. For local installations, this is typically ./node_modules/.bin; for global, it depends on npm prefix.

Adding the local bin to PATH allows running locally installed tools.

# EXAMPLE USAGE

```bash
# Show local bin
npm bin
# Output: /project/node_modules/.bin

# Show global bin
npm bin -g
# Output: /usr/local/bin

# Run local binary
$(npm bin)/eslint .

# Or add to PATH
export PATH="$(npm bin):$PATH"
eslint .
```

# ALTERNATIVES

```bash
# Use npx instead
npx eslint .

# Or npm exec
npm exec eslint .
```

# CAVEATS

Local bin changes per project. Global path varies by installation method. npx is often simpler for running binaries.

# HISTORY

npm bin has been part of npm since early versions, helping developers locate and use locally installed executables.

# SEE ALSO

[npm](/man/npm)(1), [npx](/man/npx)(1), [npm-exec](/man/npm-exec)(1), [npm-prefix](/man/npm-prefix)(1)
