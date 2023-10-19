# This is an example evolution script for creating a contact_submission table.

# Create the contact_submission table
CREATE TABLE contact_submission (
    id BIGINT AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    message TEXT,
    timestamp TIMESTAMP NOT NULL,
    PRIMARY KEY (id)
);
