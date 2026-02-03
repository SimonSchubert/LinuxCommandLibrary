# TLDR

**Start etcd server**

```etcd```

**Start with custom data directory**

```etcd --data-dir [/var/lib/etcd]```

**Start with specific listen address**

```etcd --listen-client-urls [http://localhost:2379]```

**Start with advertised URLs**

```etcd --advertise-client-urls [http://localhost:2379]```

**Start a cluster member**

```etcd --name [node1] --initial-cluster [node1=http://host1:2380,node2=http://host2:2380]```

**Enable TLS**

```etcd --cert-file [cert.pem] --key-file [key.pem]```

# SYNOPSIS

**etcd** [_options_]

# PARAMETERS

**--name** _name_
> Human-readable node name.

**--data-dir** _path_
> Data directory path.

**--listen-client-urls** _urls_
> Client listen URLs.

**--advertise-client-urls** _urls_
> Advertised client URLs.

**--listen-peer-urls** _urls_
> Peer listen URLs.

**--initial-cluster** _config_
> Initial cluster configuration.

**--initial-cluster-state** _state_
> Initial cluster state (new or existing).

**--cert-file** _file_
> TLS certificate file.

**--key-file** _file_
> TLS key file.

# DESCRIPTION

**etcd** is a distributed key-value store used for shared configuration and service discovery. Provides strong consistency using the Raft consensus algorithm. Commonly used as the backend for Kubernetes.

# SEE ALSO

[etcdctl](/man/etcdctl)(1), [etcdutl](/man/etcdutl)(1)

