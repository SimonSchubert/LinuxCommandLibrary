# TAGLINE

distributed key-value store with Raft consensus

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

**etcd** is a distributed key-value store that provides reliable, consistent data storage for distributed systems. It implements the Raft consensus algorithm to ensure strong consistency across multiple nodes, making it suitable for critical configuration data and service coordination.

The server forms the backbone of Kubernetes cluster state management and is used extensively in cloud-native architectures for configuration management, service discovery, and distributed locking. Its simple HTTP/gRPC API and watch functionality enable applications to respond to configuration changes in real-time.

etcd prioritizes consistency and availability, making it ideal for storing cluster membership, feature flags, and other distributed system metadata.

# CONFIGURATION

**/etc/etcd/etcd.conf.yml**
> Main configuration file for etcd server settings, cluster topology, and security options.

# CAVEATS

Requires careful cluster planning for production use. Network partitions affect availability. Disk performance impacts latency. Regular backups essential. Raft consensus requires quorum majority.

# HISTORY

etcd was created by **CoreOS** in **2013** and became a Cloud Native Computing Foundation (CNCF) project. It has become the de facto standard for Kubernetes configuration storage and is widely deployed in production cloud environments.

# SEE ALSO

[etcdctl](/man/etcdctl)(1), [etcdutl](/man/etcdutl)(1)

