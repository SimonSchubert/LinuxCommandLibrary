# TAGLINE

Run durable sandboxes as Hatchet tasks

# TLDR

Run the provider against the **local Docker** engine

```brickie worker --driver docker```

Run the provider on **Kubernetes**

```brickie worker --driver kubernetes```

Print the **version**

```brickie version```

Write logs as **text**

```brickie --log-format text worker --driver docker```

# SYNOPSIS

**brickie** [_options_] _command_ [_options_]

# PARAMETERS

**--log-format** json|text
> Log line format for every command. The default is **json**.

**worker**
> Run the sandbox provider as a Hatchet operator. **--driver** is **docker** (the local engine) or **kubernetes**. **--image** is the default sandbox image. **--store** is the bucket for snapshots and metadata: an s3, gs, or azblob URL, or a file URL on one machine. **--sandbox-cpu**, **--sandbox-memory**, and **--sandbox-disk** set Kubernetes limits. **--runtime** picks a Kubernetes runtime class such as **auto**, **kata**, **gvisor**, **nitro**, or **none**. **--sandbox-egress** is **internet** or **none**.

**sandbox-tls**
> Terminate mutual TLS for the sandbox daemon inside a sandbox pod. **--dir** is the directory of the CA and TLS files. The default is **/etc/brickie/tls**.

**version**
> Print the brickie version and build details.

# DESCRIPTION

**brickie** is the operator binary for Brickie sandboxes. A sandbox is a container with a shell and a workspace. Each call that changes the workspace stores an immutable snapshot, so a retry resumes from that snapshot instead of running the command twice. Applications create sandboxes through the Hatchet client libraries. This command runs the provider those calls talk to.

**worker** is the long-running process. On a laptop, **--driver docker** uses the local engine and no cluster. On Kubernetes it uses the agent-sandbox controller, a warm pool, and the runtime class you select. **sandbox-tls** is the proxy that worker places in each sandbox pod. It is not usually started by hand.

The project is in beta. Flags and the wire contract can change before 1.0.

# CAVEATS

**worker** expects a reachable Hatchet server and, for the kubernetes driver, a cluster that can run the chosen runtime. The file-URL store is for a single machine. Snapshots in object storage are required once more than one provider replica must see the same sandbox.

# SEE ALSO

[docker](/man/docker)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/hatchet-dev/brickie)```

```[Documentation](https://github.com/hatchet-dev/brickie/blob/main/docs/quickstart.md)```

<!-- verified: 2026-11-26 -->
