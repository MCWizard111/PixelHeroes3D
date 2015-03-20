package org.pixelheroes.modding;

import org.pixelheroes.resources.ResourceLocation;

/**
 * Created by MCWizard111 on 3/19/2015.
 */
public class AddonData {
	private String id, name, version, author, description;
	private ResourceLocation logoPath;

	public AddonData(AddonContainer<?> container) {
		id = container.getId();
		name = container.getName();
		version = container.getVersion();
		author = container.getAuthor();
		description = "";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public ResourceLocation getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(ResourceLocation logo) {
		this.logoPath = logo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
