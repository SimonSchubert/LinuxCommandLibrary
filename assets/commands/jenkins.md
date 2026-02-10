# TAGLINE

continuous integration and delivery server

# TLDR

**Start Jenkins**

```java -jar jenkins.war```

**Start on specific port**

```java -jar jenkins.war --httpPort=[8888]```

**Run as daemon**

```java -jar jenkins.war &```

**Specify home directory**

```JENKINS_HOME=[/var/jenkins] java -jar jenkins.war```

**Use HTTPS**

```java -jar jenkins.war --httpsPort=[8443] --httpsKeyStore=[keystore.jks]```

# SYNOPSIS

**java -jar jenkins.war** [_options_]

# PARAMETERS

**--httpPort** _PORT_
> HTTP port (default 8080).

**--httpsPort** _PORT_
> HTTPS port.

**--httpsKeyStore** _FILE_
> SSL keystore file.

**--prefix** _PATH_
> URL prefix.

**--daemon**
> Run as daemon.

**--help**
> Display help information.

# DESCRIPTION

**Jenkins** is a continuous integration and delivery server. It automates building, testing, and deploying software.

The platform supports pipelines, plugins, and distributed builds. It integrates with version control and deployment systems.

# CAVEATS

Requires Java. Resource intensive. Security configuration important.

# HISTORY

Jenkins was forked from **Hudson** in 2011 by **Kohsuke Kawaguchi**. It became the leading open-source CI/CD server.

# SEE ALSO

[java](/man/java)(1), [docker](/man/docker)(1), [gitlab-runner](/man/gitlab-runner)(1)
