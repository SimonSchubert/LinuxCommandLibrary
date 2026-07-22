# TAGLINE

manage DigitalOcean Functions serverless computing

# TLDR

**Connect to serverless namespace**

```doctl serverless connect```

**Deploy functions**

```doctl serverless deploy [path]```

**List functions**

```doctl serverless functions list```

**Invoke a function**

```doctl serverless functions invoke [name]```

**Get function logs**

```doctl serverless activations logs [activation_id]```

**Initialize a project**

```doctl serverless init --language [js] [path]```

**Redeploy on every change** while developing

```doctl serverless watch [path]```

# SYNOPSIS

**doctl** **serverless** _command_ [_arguments_] [_flags_]

# SUBCOMMANDS

**install**
> Install the serverless support plugin that the other subcommands depend on.

**upgrade** / **uninstall**
> Bring the serverless plugin in line with this version of doctl, or remove it.

**connect** [_namespace_]
> Connect local serverless support to a functions namespace.

**namespaces**
> Create, list, and delete functions namespaces.

**status**
> Show whether serverless support is installed and which namespace is connected.

**init** _path_
> Create a functions project directory. **--language** picks the runtime (`js`, `py`, `go`, `php`, ...) and **--overwrite** replaces an existing directory.

**deploy** _path_
> Deploy a functions project to the connected namespace.

**watch** _path_
> Watch a project directory and redeploy incrementally on every change.

**undeploy**
> Remove deployed functions or packages from the namespace.

**get-metadata** _path_
> Print the metadata of a functions project.

**functions**
> Work with the functions in the namespace: **list**, **get**, and **invoke**.

**activations**
> Retrieve activation records: **list**, **get**, **logs**, and **result**.

**key**
> Manage access keys for functions namespaces.

# DESCRIPTION

**doctl serverless** manages DigitalOcean Functions, a serverless computing platform that allows deploying and running code without managing infrastructure. Functions respond to events and HTTP requests, scaling automatically based on demand.

The platform supports multiple programming languages including JavaScript (Node.js), Python, PHP, and Go. Functions are organized into namespaces and deployed as projects containing one or more function definitions. Each function activation is logged and can be inspected for debugging.

Serverless computing is ideal for event-driven workloads, API endpoints, background processing, and applications with variable traffic patterns. DigitalOcean Functions handles scaling, load balancing, and infrastructure management automatically.

Under the hood the platform is built on **Apache OpenWhisk**, which is why projects are described by a `project.yml` file and why every invocation produces an *activation* record with its own ID, logs, and result.

# CAVEATS

The serverless subcommands are not part of the doctl binary itself: **doctl serverless install** downloads a plugin first, and **doctl serverless upgrade** must be re-run after doctl is updated or the commands refuse to work. You also have to **connect** to a namespace before deploying, and a namespace belongs to exactly one region. Functions are subject to platform limits on execution time, memory, and payload size, and long-running or stateful workloads belong in App Platform or a Droplet instead.

# INSTALL

```dnf: sudo dnf install doctl```

```pacman: sudo pacman -S doctl```

```apk: sudo apk add doctl```

```brew: brew install doctl```

```nix: nix profile install nixpkgs#doctl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[doctl](/man/doctl)(1), [doctl-apps](/man/doctl-apps)(1)

# RESOURCES

```[Source code](https://github.com/digitalocean/doctl)```

```[Documentation](https://docs.digitalocean.com/reference/doctl/reference/serverless/)```

<!-- verified: 2026-07-14 -->

