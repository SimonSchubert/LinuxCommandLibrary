# TAGLINE

Node.js web application scaffolding tool

# TLDR

**Create Express app with generator**

```npx express-generator [myapp]```

**Create with view engine**

```npx express-generator --view=[pug] [myapp]```

**Create with CSS preprocessor**

```npx express-generator --css=[sass] [myapp]```

**Create without view engine**

```npx express-generator --no-view [myapp]```

**Create with git ignore**

```npx express-generator --git [myapp]```

# SYNOPSIS

**express-generator** [_options_] [_dir_]

# PARAMETERS

**--view** _engine_
> View engine: pug, ejs, hbs, hjs, twig.

**--css** _engine_
> CSS preprocessor: sass, less, stylus, compass.

**-e**, **--ejs**
> Use EJS template engine.

**--pug**
> Use Pug template engine.

**--hbs**
> Use Handlebars template engine.

**--no-view**
> Generate without view engine.

**-c** _engine_
> CSS engine (same as --css).

**--git**
> Add .gitignore.

**-f**, **--force**
> Force on non-empty directory.

# DESCRIPTION

**express-generator** scaffolds Express.js web applications. It creates the basic directory structure, package.json, and boilerplate code for starting an Express server.

Express is a minimal Node.js web framework. The generator provides a conventional starting point with routes, views (optional), static files, and error handling.

# GENERATED STRUCTURE

```
myapp/
├── app.js          # Main application
├── package.json    # Dependencies
├── bin/www         # Server entry point
├── public/         # Static files
├── routes/         # Route handlers
└── views/          # Templates
```

# CAVEATS

Generator provides minimal setup. Production needs additional configuration (security, logging, etc.). Express 5 is in development; generator may lag. Consider alternatives like Fastify or Nest.js for larger projects.

# HISTORY

Express was created by **TJ Holowaychuk** in **2010** and became the most popular Node.js web framework. The express-generator was separated from the main package to allow the core framework to remain minimal.

# SEE ALSO

[node](/man/node)(1), [npm](/man/npm)(1), [nodemon](/man/nodemon)(1)
