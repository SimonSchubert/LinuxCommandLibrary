# TLDR

**Run the development server**

```flask run```

**Run with debug mode** and auto-reload

```flask run --debug```

**Run on a specific host and port**

```flask run --host [0.0.0.0] --port [8080]```

**Start an interactive Python shell** with app context

```flask shell```

**List all routes** in the application

```flask routes```

**Initialize a database** (if using Flask-Migrate)

```flask db init```

**Run database migrations**

```flask db upgrade```

**Set the application module**

```FLASK_APP=[app.py] flask run```

# SYNOPSIS

**flask** [_--app module_] [_--debug_] _command_ [_options_]

# PARAMETERS

**--app** _module_
> Specify the Flask application module (or set FLASK_APP environment variable).

**--debug** / **--no-debug**
> Enable/disable debug mode with auto-reloader and debugger.

**run** [_--host host_] [_--port port_]
> Run the development server.

**shell**
> Open an interactive Python shell with application context.

**routes** [_--sort endpoint|methods|rule_]
> Show all registered URL rules.

**--version**
> Show Flask version.

**--help**
> Show help for a command.

# RUN OPTIONS

**--host** _address_
> Network interface to bind to (default: 127.0.0.1).

**--port** _port_
> Port to listen on (default: 5000).

**--reload** / **--no-reload**
> Enable/disable auto-reload on code changes.

**--debugger** / **--no-debugger**
> Enable/disable the interactive debugger.

**--cert** _path_
> SSL certificate file for HTTPS.

**--key** _path_
> SSL key file for HTTPS.

# DESCRIPTION

**flask** is the command-line interface for Flask, a popular Python web microframework. It provides commands for running development servers, opening application shells, and executing custom commands defined by Flask extensions or the application.

The CLI discovers the Flask application through the **FLASK_APP** environment variable or **--app** option. It supports loading from modules (app), module:app patterns (myapp:create_app()), or factory functions.

The development server (flask run) includes an auto-reloader that restarts when code changes and an interactive debugger that appears in the browser on errors. These features should only be used in development, never in production.

Flask extensions often add their own CLI commands. Flask-Migrate adds **flask db** commands for database migrations, Flask-Admin might add admin commands, etc. Applications can define custom commands using the **@app.cli.command()** decorator.

The shell command provides an interactive Python session with the application and its context pre-loaded, useful for testing and debugging.

# CAVEATS

The development server is not suitable for production use. Debug mode exposes sensitive information and should never be enabled in production. The server is single-threaded by default. Use a production WSGI server like Gunicorn or uWSGI for deployment.

# HISTORY

**Flask** was created by Armin Ronacher in **2010** as part of an April Fools' joke that became popular. The CLI was added in Flask 0.11 (**2016**), replacing the older flask-script extension and server startup method. Flask has become one of the most widely used Python web frameworks.

# SEE ALSO

[gunicorn](/man/gunicorn)(1), [uvicorn](/man/uvicorn)(1), [python](/man/python)(1), [pip](/man/pip)(1), [django-admin](/man/django-admin)(1)
