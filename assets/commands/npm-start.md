# TAGLINE

runs the "start" script defined in package

# TLDR

**Run start script**

```npm start```

**Start with arguments**

```npm start -- [args]```

**Start in silent mode**

```npm start --silent```

# SYNOPSIS

**npm start** [-- _args_]

# PARAMETERS

**--**
> Pass arguments to script.

**--silent**
> Reduce output.

**--ignore-scripts**
> Don't run scripts.

# DESCRIPTION

**npm start** runs the "start" script defined in package.json. If no start script is defined, it defaults to "node server.js".

This is a shorthand for "npm run start" and is commonly used to launch applications.

# PACKAGE.JSON

```json
{
  "scripts": {
    "start": "node app.js",
    "start:dev": "nodemon app.js",
    "start:prod": "NODE_ENV=production node app.js"
  }
}
```

# COMMON START SCRIPTS

```bash
# Node.js
"start": "node index.js"

# React (Create React App)
"start": "react-scripts start"

# Next.js
"start": "next start"

# Express
"start": "node server.js"
```

# CAVEATS

Defaults to "node server.js" if no script defined. Use -- to pass arguments. Exit code reflects script exit code.

# HISTORY

npm start was established as the conventional entry point for Node.js applications, becoming a de facto standard.

# SEE ALSO

[npm](/man/npm)(1), [npm-run-script](/man/npm-run-script)(1), [npm-test](/man/npm-test)(1)
