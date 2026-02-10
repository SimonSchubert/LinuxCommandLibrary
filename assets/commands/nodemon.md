# TAGLINE

automatically restarts Node

# TLDR

**Watch and restart Node app**

```nodemon [app.js]```

**Watch specific extensions**

```nodemon -e [js,json] [app.js]```

**Watch specific directory**

```nodemon --watch [src/] [app.js]```

**Ignore files**

```nodemon --ignore [test/] [app.js]```

**Execute with different runtime**

```nodemon --exec [ts-node] [app.ts]```

**Delay restart**

```nodemon --delay [2] [app.js]```

**Use config file**

```nodemon --config [nodemon.json]```

# SYNOPSIS

**nodemon** [_options_] [_script_] [_args_]

# PARAMETERS

_SCRIPT_
> Script to run.

**-e** _EXT_
> File extensions to watch.

**--watch** _DIR_
> Directories to watch.

**--ignore** _PATTERN_
> Patterns to ignore.

**--exec** _CMD_
> Execution command.

**--delay** _SECS_
> Restart delay.

**--help**
> Display help information.

# DESCRIPTION

**nodemon** automatically restarts Node.js applications. Watches for file changes.

The tool aids development. Restarts on save without manual intervention.

# CAVEATS

Development tool. Not for production. Watches file system.

# HISTORY

nodemon was created by **Remy Sharp** to improve Node.js development workflow.

# SEE ALSO

[node](/man/node)(1), [pm2](/man/pm2)(1), [forever](/man/forever)(1)

