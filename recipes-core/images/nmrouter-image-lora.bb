require recipes-core/images/nmrouter-image.bb


SUMMARY = "nmrouter image that includes some lora packages"
IMAGE_INSTALL_append = " \
                lora-packet-forwarder \
                "

