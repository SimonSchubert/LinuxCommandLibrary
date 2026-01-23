# TLDR

**List all IoT things**

```aws iot list-things```

**Create a new thing**

```aws iot create-thing --thing-name [device_name]```

**Describe a thing**

```aws iot describe-thing --thing-name [device_name]```

**Create keys and certificate** for a device

```aws iot create-keys-and-certificate --set-as-active --certificate-pem-outfile [cert.pem] --private-key-outfile [private.key]```

**Attach a policy** to a certificate

```aws iot attach-policy --policy-name [policy_name] --target [certificate_arn]```

**Attach a certificate** to a thing

```aws iot attach-thing-principal --thing-name [device_name] --principal [certificate_arn]```

**Get the IoT endpoint** for your account

```aws iot describe-endpoint --endpoint-type iot:Data-ATS```

**List certificates**

```aws iot list-certificates```

# SYNOPSIS

**aws iot** _subcommand_ [_options_]

# DESCRIPTION

**aws iot** is a subcommand of the AWS CLI that manages AWS IoT Core, a platform for connecting IoT devices to the cloud. It handles device registry, security, and message routing.

Things are representations of physical devices in the registry. Each thing can have attributes, types, and groups for organization. Devices authenticate using X.509 certificates and policies control what actions they can perform.

The message broker uses MQTT, HTTPS, and WebSocket protocols. Rules engine processes incoming messages and routes them to AWS services like Lambda, S3, DynamoDB, or other IoT topics.

# PARAMETERS

**list-things**
> List registered things.

**create-thing**
> Register a new thing.

**describe-thing**
> Get thing details.

**delete-thing**
> Remove a thing from registry.

**create-keys-and-certificate**
> Generate a new certificate and key pair.

**list-certificates**
> List certificates in the account.

**attach-policy**
> Attach an IoT policy to a certificate or identity.

**detach-policy**
> Remove a policy attachment.

**attach-thing-principal**
> Associate a certificate with a thing.

**describe-endpoint**
> Get the IoT endpoint for connections.

**create-policy**
> Create an IoT policy document.

**list-thing-groups**
> List thing groups.

**--thing-name** _name_
> Name of the thing.

**--certificate-pem-outfile** _file_
> File to write certificate PEM.

**--private-key-outfile** _file_
> File to write private key.

**--policy-name** _name_
> Name of the IoT policy.

**--endpoint-type** _type_
> Endpoint type (iot:Data-ATS recommended).

# CAVEATS

Certificates must be activated before use. Deleting a thing does not delete its certificates or policies. Use ATS (Amazon Trust Services) endpoints for production. Thing names are unique per account/region. Policies are separate from IAM policies and follow IoT-specific syntax.

# HISTORY

**AWS IoT** was announced at **AWS re:Invent 2015** and launched in general availability in **January 2016**. The platform has expanded to include IoT Greengrass for edge computing, IoT Analytics for data analysis, IoT Device Management for fleet operations, and IoT SiteWise for industrial data. The core service continues to evolve with features like fleet provisioning and configurable endpoints.

# SEE ALSO

[aws](/man/aws)(1), [mosquitto](/man/mosquitto)(1), [aws-iot-data](/man/aws-iot-data)(1), [aws-greengrass](/man/aws-greengrass)(1)
