# TLDR

**Run a WSGI application** with HTTP server

```uwsgi --http :8080 --wsgi-file [app.py]```

**Run with multiple processes and threads**

```uwsgi --http :8080 --wsgi-file [app.py] --master --processes [4] --threads [2]```

**Run with a Unix socket** for Nginx

```uwsgi --socket [/tmp/uwsgi.sock] --wsgi-file [app.py] --chmod-socket=666```

**Run a Django application**

```uwsgi --http :8080 --module [myproject.wsgi]:application```

**Run from a configuration file**

```uwsgi --ini [uwsgi.ini]```

**Enable stats server**

```uwsgi --http :8080 --wsgi-file [app.py] --stats 127.0.0.1:9191```

# SYNOPSIS

**uwsgi** [_options_]

# PARAMETERS

**--http** _address_
> Enable HTTP server on specified address:port

**--socket** _address_
> Bind to specified UNIX/TCP socket for uwsgi protocol

**--wsgi-file** _file_
> Load WSGI application from Python file

**--module** _module_
> Load WSGI application from specified module

**--master**
> Enable master process for managing workers

**--processes** _n_
> Spawn n worker processes

**--threads** _n_
> Run n threads per worker process

**--chdir** _path_
> Change to directory before loading application

**--virtualenv** _path_
> Use specified Python virtualenv

**--ini** _file_
> Load configuration from INI file

**--stats** _address_
> Enable stats server on specified address

**--chmod-socket**
> Set socket file permissions

# DESCRIPTION

**uWSGI** is an application server that implements the WSGI specification for serving Python web applications. It provides a bridge between web servers like Nginx and Python frameworks like Django, Flask, and Pyramid.

The server supports multiple protocols: HTTP for direct serving, the uwsgi binary protocol for efficient Nginx communication, and sockets for local IPC. It handles process management, load balancing, and caching.

Configuration can be provided via command-line options or INI/YAML/JSON files. The master process mode enables graceful reloading and automatic worker respawning.

# CAVEATS

uWSGI has been in maintenance mode since **October 2022**. Consider alternatives like Gunicorn for new projects. The uwsgi protocol (lowercase) is different from the uWSGI application server. Socket permissions require careful configuration when running behind Nginx.

# HISTORY

uWSGI was developed as a full-stack application server supporting multiple languages and protocols. Despite its name coming from WSGI, it expanded to support Ruby (Rack), Perl (PSGI), and other languages. The project became widely adopted for Python deployments.

# SEE ALSO

[gunicorn](/man/gunicorn)(1), [nginx](/man/nginx)(8), [python](/man/python)(1), [pip](/man/pip)(1)
